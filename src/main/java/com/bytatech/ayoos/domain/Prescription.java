package com.bytatech.ayoos.domain;


import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import org.springframework.data.elasticsearch.annotations.Document;
import java.io.Serializable;
import java.util.Objects;

/**
 * A Prescription.
 */
@Entity
@Table(name = "prescription")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
@Document(indexName = "prescription")
public class Prescription implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prescription_dmsurl")
    private String prescriptionDMSURL;

    @Column(name = "drug")
    private String drug;

    @Column(name = "dose")
    private String dose;

    @Column(name = "frequency")
    private String frequency;

    @Column(name = "period")
    private String period;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrescriptionDMSURL() {
        return prescriptionDMSURL;
    }

    public Prescription prescriptionDMSURL(String prescriptionDMSURL) {
        this.prescriptionDMSURL = prescriptionDMSURL;
        return this;
    }

    public void setPrescriptionDMSURL(String prescriptionDMSURL) {
        this.prescriptionDMSURL = prescriptionDMSURL;
    }

    public String getDrug() {
        return drug;
    }

    public Prescription drug(String drug) {
        this.drug = drug;
        return this;
    }

    public void setDrug(String drug) {
        this.drug = drug;
    }

    public String getDose() {
        return dose;
    }

    public Prescription dose(String dose) {
        this.dose = dose;
        return this;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public String getFrequency() {
        return frequency;
    }

    public Prescription frequency(String frequency) {
        this.frequency = frequency;
        return this;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getPeriod() {
        return period;
    }

    public Prescription period(String period) {
        this.period = period;
        return this;
    }

    public void setPeriod(String period) {
        this.period = period;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Prescription prescription = (Prescription) o;
        if (prescription.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), prescription.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Prescription{" +
            "id=" + getId() +
            ", prescriptionDMSURL='" + getPrescriptionDMSURL() + "'" +
            ", drug='" + getDrug() + "'" +
            ", dose='" + getDose() + "'" +
            ", frequency='" + getFrequency() + "'" +
            ", period='" + getPeriod() + "'" +
            "}";
    }
}
