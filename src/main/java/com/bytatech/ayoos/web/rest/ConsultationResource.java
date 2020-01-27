package com.bytatech.ayoos.web.rest;
import com.bytatech.ayoos.service.ConsultationService;
import com.bytatech.ayoos.web.rest.errors.BadRequestAlertException;
import com.bytatech.ayoos.web.rest.util.HeaderUtil;
import com.bytatech.ayoos.web.rest.util.PaginationUtil;
import com.bytatech.ayoos.service.dto.ConsultationDTO;
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
 * REST controller for managing Consultation.
 */
@RestController
@RequestMapping("/api")
public class ConsultationResource {

    private final Logger log = LoggerFactory.getLogger(ConsultationResource.class);

    private static final String ENTITY_NAME = "consultationConsultation";

    private final ConsultationService consultationService;

    public ConsultationResource(ConsultationService consultationService) {
        this.consultationService = consultationService;
    }

    /**
     * POST  /consultations : Create a new consultation.
     *
     * @param consultationDTO the consultationDTO to create
     * @return the ResponseEntity with status 201 (Created) and with body the new consultationDTO, or with status 400 (Bad Request) if the consultation has already an ID
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PostMapping("/consultations")
    public ResponseEntity<ConsultationDTO> createConsultation(@RequestBody ConsultationDTO consultationDTO) throws URISyntaxException {
        log.debug("REST request to save Consultation : {}", consultationDTO);
        if (consultationDTO.getId() != null) {
            throw new BadRequestAlertException("A new consultation cannot already have an ID", ENTITY_NAME, "idexists");
        }
        ConsultationDTO result = consultationService.save(consultationDTO);
        return ResponseEntity.created(new URI("/api/consultations/" + result.getId()))
            .headers(HeaderUtil.createEntityCreationAlert(ENTITY_NAME, result.getId().toString()))
            .body(result);
    }

    /**
     * PUT  /consultations : Updates an existing consultation.
     *
     * @param consultationDTO the consultationDTO to update
     * @return the ResponseEntity with status 200 (OK) and with body the updated consultationDTO,
     * or with status 400 (Bad Request) if the consultationDTO is not valid,
     * or with status 500 (Internal Server Error) if the consultationDTO couldn't be updated
     * @throws URISyntaxException if the Location URI syntax is incorrect
     */
    @PutMapping("/consultations")
    public ResponseEntity<ConsultationDTO> updateConsultation(@RequestBody ConsultationDTO consultationDTO) throws URISyntaxException {
        log.debug("REST request to update Consultation : {}", consultationDTO);
        if (consultationDTO.getId() == null) {
            throw new BadRequestAlertException("Invalid id", ENTITY_NAME, "idnull");
        }
        ConsultationDTO result = consultationService.save(consultationDTO);
        return ResponseEntity.ok()
            .headers(HeaderUtil.createEntityUpdateAlert(ENTITY_NAME, consultationDTO.getId().toString()))
            .body(result);
    }

    /**
     * GET  /consultations : get all the consultations.
     *
     * @param pageable the pagination information
     * @return the ResponseEntity with status 200 (OK) and the list of consultations in body
     */
    @GetMapping("/consultations")
    public ResponseEntity<List<ConsultationDTO>> getAllConsultations(Pageable pageable) {
        log.debug("REST request to get a page of Consultations");
        Page<ConsultationDTO> page = consultationService.findAll(pageable);
        HttpHeaders headers = PaginationUtil.generatePaginationHttpHeaders(page, "/api/consultations");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

    /**
     * GET  /consultations/:id : get the "id" consultation.
     *
     * @param id the id of the consultationDTO to retrieve
     * @return the ResponseEntity with status 200 (OK) and with body the consultationDTO, or with status 404 (Not Found)
     */
    @GetMapping("/consultations/{id}")
    public ResponseEntity<ConsultationDTO> getConsultation(@PathVariable Long id) {
        log.debug("REST request to get Consultation : {}", id);
        Optional<ConsultationDTO> consultationDTO = consultationService.findOne(id);
        return ResponseUtil.wrapOrNotFound(consultationDTO);
    }

    /**
     * DELETE  /consultations/:id : delete the "id" consultation.
     *
     * @param id the id of the consultationDTO to delete
     * @return the ResponseEntity with status 200 (OK)
     */
    @DeleteMapping("/consultations/{id}")
    public ResponseEntity<Void> deleteConsultation(@PathVariable Long id) {
        log.debug("REST request to delete Consultation : {}", id);
        consultationService.delete(id);
        return ResponseEntity.ok().headers(HeaderUtil.createEntityDeletionAlert(ENTITY_NAME, id.toString())).build();
    }

    /**
     * SEARCH  /_search/consultations?query=:query : search for the consultation corresponding
     * to the query.
     *
     * @param query the query of the consultation search
     * @param pageable the pagination information
     * @return the result of the search
     */
    @GetMapping("/_search/consultations")
    public ResponseEntity<List<ConsultationDTO>> searchConsultations(@RequestParam String query, Pageable pageable) {
        log.debug("REST request to search for a page of Consultations for query {}", query);
        Page<ConsultationDTO> page = consultationService.search(query, pageable);
        HttpHeaders headers = PaginationUtil.generateSearchPaginationHttpHeaders(query, page, "/api/_search/consultations");
        return ResponseEntity.ok().headers(headers).body(page.getContent());
    }

}
