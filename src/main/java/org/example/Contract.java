package org.example;

import java.time.LocalDate;

public class Contract {
    private Long id;
    private String contractDetails;
    private LocalDate contractStartDate;
    private LocalDate contractFinishDate;
    private double value;

    public Contract(Long id, String contractDetails, LocalDate contractStartDate,
                    LocalDate contractFinishDate, double value) {
        this.id = id;
        this.contractDetails = contractDetails;
        this.contractStartDate = contractStartDate;
        this.contractFinishDate = contractFinishDate;
        this.value = value;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContractDetails() {
        return contractDetails;
    }

    public void setContractDetails(String contractDetails) {
        this.contractDetails = contractDetails;
    }

    public LocalDate getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(LocalDate contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public LocalDate getContractFinishDate() {
        return contractFinishDate;
    }

    public void setContractFinishDate(LocalDate contractFinishDate) {
        this.contractFinishDate = contractFinishDate;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}