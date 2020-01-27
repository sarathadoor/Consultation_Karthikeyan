package com.bytatech.ayoos.web.rest;

import com.bytatech.ayoos.ConsultationApp;

import com.bytatech.ayoos.domain.Symptom;
import com.bytatech.ayoos.repository.SymptomRepository;
import com.bytatech.ayoos.repository.search.SymptomSearchRepository;
import com.bytatech.ayoos.service.SymptomService;
import com.bytatech.ayoos.service.dto.SymptomDTO;
import com.bytatech.ayoos.service.mapper.SymptomMapper;
import com.bytatech.ayoos.web.rest.errors.ExceptionTranslator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;


import static com.bytatech.ayoos.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.elasticsearch.index.query.QueryBuilders.queryStringQuery;
import static org.hamcrest.Matchers.hasItem;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Test class for the SymptomResource REST controller.
 *
 * @see SymptomResource
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ConsultationApp.class)
public class SymptomResourceIntTest {

    private static final String DEFAULT_SYMPTOM_REF = "AAAAAAAAAA";
    private static final String UPDATED_SYMPTOM_REF = "BBBBBBBBBB";

    @Autowired
    private SymptomRepository symptomRepository;

    @Autowired
    private SymptomMapper symptomMapper;

    @Autowired
    private SymptomService symptomService;

    /**
     * This repository is mocked in the com.bytatech.ayoos.repository.search test package.
     *
     * @see com.bytatech.ayoos.repository.search.SymptomSearchRepositoryMockConfiguration
     */
    @Autowired
    private SymptomSearchRepository mockSymptomSearchRepository;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restSymptomMockMvc;

    private Symptom symptom;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final SymptomResource symptomResource = new SymptomResource(symptomService);
        this.restSymptomMockMvc = MockMvcBuilders.standaloneSetup(symptomResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Symptom createEntity(EntityManager em) {
        Symptom symptom = new Symptom()
            .symptomRef(DEFAULT_SYMPTOM_REF);
        return symptom;
    }

    @Before
    public void initTest() {
        symptom = createEntity(em);
    }

    @Test
    @Transactional
    public void createSymptom() throws Exception {
        int databaseSizeBeforeCreate = symptomRepository.findAll().size();

        // Create the Symptom
        SymptomDTO symptomDTO = symptomMapper.toDto(symptom);
        restSymptomMockMvc.perform(post("/api/symptoms")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(symptomDTO)))
            .andExpect(status().isCreated());

        // Validate the Symptom in the database
        List<Symptom> symptomList = symptomRepository.findAll();
        assertThat(symptomList).hasSize(databaseSizeBeforeCreate + 1);
        Symptom testSymptom = symptomList.get(symptomList.size() - 1);
        assertThat(testSymptom.getSymptomRef()).isEqualTo(DEFAULT_SYMPTOM_REF);

        // Validate the Symptom in Elasticsearch
        verify(mockSymptomSearchRepository, times(1)).save(testSymptom);
    }

    @Test
    @Transactional
    public void createSymptomWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = symptomRepository.findAll().size();

        // Create the Symptom with an existing ID
        symptom.setId(1L);
        SymptomDTO symptomDTO = symptomMapper.toDto(symptom);

        // An entity with an existing ID cannot be created, so this API call must fail
        restSymptomMockMvc.perform(post("/api/symptoms")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(symptomDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Symptom in the database
        List<Symptom> symptomList = symptomRepository.findAll();
        assertThat(symptomList).hasSize(databaseSizeBeforeCreate);

        // Validate the Symptom in Elasticsearch
        verify(mockSymptomSearchRepository, times(0)).save(symptom);
    }

    @Test
    @Transactional
    public void getAllSymptoms() throws Exception {
        // Initialize the database
        symptomRepository.saveAndFlush(symptom);

        // Get all the symptomList
        restSymptomMockMvc.perform(get("/api/symptoms?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(symptom.getId().intValue())))
            .andExpect(jsonPath("$.[*].symptomRef").value(hasItem(DEFAULT_SYMPTOM_REF.toString())));
    }
    
    @Test
    @Transactional
    public void getSymptom() throws Exception {
        // Initialize the database
        symptomRepository.saveAndFlush(symptom);

        // Get the symptom
        restSymptomMockMvc.perform(get("/api/symptoms/{id}", symptom.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.id").value(symptom.getId().intValue()))
            .andExpect(jsonPath("$.symptomRef").value(DEFAULT_SYMPTOM_REF.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingSymptom() throws Exception {
        // Get the symptom
        restSymptomMockMvc.perform(get("/api/symptoms/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updateSymptom() throws Exception {
        // Initialize the database
        symptomRepository.saveAndFlush(symptom);

        int databaseSizeBeforeUpdate = symptomRepository.findAll().size();

        // Update the symptom
        Symptom updatedSymptom = symptomRepository.findById(symptom.getId()).get();
        // Disconnect from session so that the updates on updatedSymptom are not directly saved in db
        em.detach(updatedSymptom);
        updatedSymptom
            .symptomRef(UPDATED_SYMPTOM_REF);
        SymptomDTO symptomDTO = symptomMapper.toDto(updatedSymptom);

        restSymptomMockMvc.perform(put("/api/symptoms")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(symptomDTO)))
            .andExpect(status().isOk());

        // Validate the Symptom in the database
        List<Symptom> symptomList = symptomRepository.findAll();
        assertThat(symptomList).hasSize(databaseSizeBeforeUpdate);
        Symptom testSymptom = symptomList.get(symptomList.size() - 1);
        assertThat(testSymptom.getSymptomRef()).isEqualTo(UPDATED_SYMPTOM_REF);

        // Validate the Symptom in Elasticsearch
        verify(mockSymptomSearchRepository, times(1)).save(testSymptom);
    }

    @Test
    @Transactional
    public void updateNonExistingSymptom() throws Exception {
        int databaseSizeBeforeUpdate = symptomRepository.findAll().size();

        // Create the Symptom
        SymptomDTO symptomDTO = symptomMapper.toDto(symptom);

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restSymptomMockMvc.perform(put("/api/symptoms")
            .contentType(TestUtil.APPLICATION_JSON_UTF8)
            .content(TestUtil.convertObjectToJsonBytes(symptomDTO)))
            .andExpect(status().isBadRequest());

        // Validate the Symptom in the database
        List<Symptom> symptomList = symptomRepository.findAll();
        assertThat(symptomList).hasSize(databaseSizeBeforeUpdate);

        // Validate the Symptom in Elasticsearch
        verify(mockSymptomSearchRepository, times(0)).save(symptom);
    }

    @Test
    @Transactional
    public void deleteSymptom() throws Exception {
        // Initialize the database
        symptomRepository.saveAndFlush(symptom);

        int databaseSizeBeforeDelete = symptomRepository.findAll().size();

        // Delete the symptom
        restSymptomMockMvc.perform(delete("/api/symptoms/{id}", symptom.getId())
            .accept(TestUtil.APPLICATION_JSON_UTF8))
            .andExpect(status().isOk());

        // Validate the database is empty
        List<Symptom> symptomList = symptomRepository.findAll();
        assertThat(symptomList).hasSize(databaseSizeBeforeDelete - 1);

        // Validate the Symptom in Elasticsearch
        verify(mockSymptomSearchRepository, times(1)).deleteById(symptom.getId());
    }

    @Test
    @Transactional
    public void searchSymptom() throws Exception {
        // Initialize the database
        symptomRepository.saveAndFlush(symptom);
        when(mockSymptomSearchRepository.search(queryStringQuery("id:" + symptom.getId()), PageRequest.of(0, 20)))
            .thenReturn(new PageImpl<>(Collections.singletonList(symptom), PageRequest.of(0, 1), 1));
        // Search the symptom
        restSymptomMockMvc.perform(get("/api/_search/symptoms?query=id:" + symptom.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_UTF8_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(symptom.getId().intValue())))
            .andExpect(jsonPath("$.[*].symptomRef").value(hasItem(DEFAULT_SYMPTOM_REF)));
    }

    @Test
    @Transactional
    public void equalsVerifier() throws Exception {
        TestUtil.equalsVerifier(Symptom.class);
        Symptom symptom1 = new Symptom();
        symptom1.setId(1L);
        Symptom symptom2 = new Symptom();
        symptom2.setId(symptom1.getId());
        assertThat(symptom1).isEqualTo(symptom2);
        symptom2.setId(2L);
        assertThat(symptom1).isNotEqualTo(symptom2);
        symptom1.setId(null);
        assertThat(symptom1).isNotEqualTo(symptom2);
    }

    @Test
    @Transactional
    public void dtoEqualsVerifier() throws Exception {
        TestUtil.equalsVerifier(SymptomDTO.class);
        SymptomDTO symptomDTO1 = new SymptomDTO();
        symptomDTO1.setId(1L);
        SymptomDTO symptomDTO2 = new SymptomDTO();
        assertThat(symptomDTO1).isNotEqualTo(symptomDTO2);
        symptomDTO2.setId(symptomDTO1.getId());
        assertThat(symptomDTO1).isEqualTo(symptomDTO2);
        symptomDTO2.setId(2L);
        assertThat(symptomDTO1).isNotEqualTo(symptomDTO2);
        symptomDTO1.setId(null);
        assertThat(symptomDTO1).isNotEqualTo(symptomDTO2);
    }

    @Test
    @Transactional
    public void testEntityFromId() {
        assertThat(symptomMapper.fromId(42L).getId()).isEqualTo(42);
        assertThat(symptomMapper.fromId(null)).isNull();
    }
}
