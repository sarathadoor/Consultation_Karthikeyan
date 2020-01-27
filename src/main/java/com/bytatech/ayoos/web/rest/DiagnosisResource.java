package com.bytatech.ayoos.web.rest;
import com.bytatech.ayoos.service.DiagnosisService;
import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.web.rest.util.HeaderUtil;
import com.bytatech.ayoos.web.rest.util.PaginationUtil;
import com.bytatech.ayoos.service.dto.DiagnosisDTO;
import io.github.jhipster.web.util.ResponseUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;

import java.util.List;
import java.util.Optional;
import java.util.stream.StreamSupport;

import static org.elasticsearch.index.query.QueryBuilders.*;

/**
 * REST controller for managing Diagnosis.
 */
@RestController
@RequestMapping("/api")
public class DiagnosisResource {

    private final Logger log = LoggerFactory.getLogger(DiagnosisResource.class);

    private static final String ENTITY_NAME = "consultationDiagnosis";

    private final DiagnosisService diagnosisService;

    public DiagnosisResource(DiagnosisService diagnosisService) {
        this.diagnosisService = diagnosisService;
    }

    /**
     * POST  /diagnoses : Create a new diagnosis.
     *
     * @param diagnosisDTO the diagnosisDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new diagnosisDTO, or with status 400 (Bad Request) if the diagnosis has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/diagnoses")
    public ResponseEntity<DiagnosisDTO> createDiagnosis(@RequestBody DiagnosisDTO diagnosisDTO) throws URISyntaxException {
        log.debug("REST request to save Diagnosis : {}", diagnosisDTO);
        if (diagnosisDTO.getId() != null) {
            throw new BadRequestAlertException("A new diagnosis cannot already have an ID", ENTITY_NAME, "idexists");
        }
        DiagnosisDTO result = diagnosisService.save(diagnosisDTO);
        return ResponseEntity.created(new URI("/api/diagnoses/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /diagnoses : Updates an existing diagnosis.
     *
     * @param diagnosisDTO the diagnosisDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated diagnosisDTO,
     * or with status 400 (Bad Request) if the diagnosisDTO is not valid,
     * or with status 500 (Internal Server Error) if the diagnosisDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/diagnoses")
    public ResponseEntity<DiagnosisDTO> updateDiagnosis(@RequestBody DiagnosisDTO diagnosisDTO) throws URISyntaxException {
        log.debug("REST request to update Diagnosis : {}", diagnosisDTO);
        if (diagnosisDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        DiagnosisDTO result = diagnosisService.save(diagnosisDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, diagnosisDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /diagnoses : get all the diagnoses.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of diagnoses in body
     */
    @GetMapping("/diagnoses")
    public ResponseEntity<List<DiagnosisDTO>> getAllDiagnoses(Pageable pageable) {
        log.debug("REST request to get a page of Diagnoses");
        Page<DiagnosisDTO> page = diagnosisService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/diagnoses");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /diagnoses/:id : get the "id" diagnosis.
     *
     * @param id the id of the diagnosisDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the diagnosisDTO, or with status 404 (Not Found)
     */
    @GetMapping("/diagnoses/{id}")
    public ResponseEntity<DiagnosisDTO> getDiagnosis(@PathVariable Long id) {
        log.debug("REST request to get Diagnosis : {}", id);
        Optional<DiagnosisDTO> diagnosisDTO = diagnosisService.findOne(id);
        return ResponseUtil.wrapOrNotFound(diagnosisDTO);
    }

    /**
     * DELETE  /diagnoses/:id : delete the "id" diagnosis.
     *
     * @param id the id of the diagnosisDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/diagnoses/{id}")
    public ResponseEntity<Void> deleteDiagnosis(@PathVariable Long id) {
        log.debug("REST request to delete Diagnosis : {}", id);
        diagnosisService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    /**
     * SEARCH  /_search/diagnoses?query=:query : search for the diagnosis corresponding
     * to the query.
     *
     * @param query the query of the diagnosis search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/diagnoses")
    public ResponseEntity<List<DiagnosisDTO>> searchDiagnoses(@RequestParam String query, Pageable pageable) {
        log.debug("REST request to search for a page of Diagnoses for query {}", query);
        Page<DiagnosisDTO> page = diagnosisService.search(query, pageable);
        HttpHeaders headers = PaginationUtil.generateSearchPaginationHttpHeaders(query, page, "/api/_search/diagnoses");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

}
