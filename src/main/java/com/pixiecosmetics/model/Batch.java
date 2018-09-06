package com.pixiecosmetics.model;

import java.time.LocalDate;
import java.util.List;

public class Batch {

    private String batchNumber;
    private Shade shade;
    private LocalDate productionDate;
    private LocalDate expirationDate;
    private PeriodAfterOpening periodAfterOpening;
    private List<Document> documents;

    public Batch() {}

    public Batch(String batchNumber, Shade shade, LocalDate productionDate, LocalDate expirationDate) {
        this.batchNumber = batchNumber;
        this.shade = shade;
        this.productionDate = productionDate;
        this.expirationDate = expirationDate;
    }

    public Batch(String batchNumber, Shade shade, LocalDate productionDate, PeriodAfterOpening periodAfterOpening) {
        this.batchNumber = batchNumber;
        this.shade = shade;
        this.productionDate = productionDate;
        this.periodAfterOpening = periodAfterOpening;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public PeriodAfterOpening getPeriodAfterOpening() {
        return periodAfterOpening;
    }

    public void setPeriodAfterOpening(PeriodAfterOpening periodAfterOpening) {
        this.periodAfterOpening = periodAfterOpening;
    }

    public Shade getShade() {
        return shade;
    }

    public void setShade(Shade shade) {
        this.shade = shade;
    }

    public List<Document> getDocuments() {
        return documents;
    }

    public void setDocuments(List<Document> documents) {
        this.documents = documents;
    }
}
