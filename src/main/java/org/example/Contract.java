package org.example;

import java.time.LocalDateTime;

public class Contract {
    private Long id;
    private String contractDetails;
    private LocalDateTime contractStartDate;
    private LocalDateTime contractFinishDate;
    private Client client;

    public Contract(Long id, String contractDetails, LocalDateTime contractStartDate, LocalDateTime contractFinishDate, Client client) {
        this.id = id;
        this.contractDetails = contractDetails;
        this.contractStartDate = contractStartDate;
        this.contractFinishDate = contractFinishDate;
        this.client = client;
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

    public LocalDateTime getContractStartDate() {
        return contractStartDate;
    }

    public void setContractStartDate(LocalDateTime contractStartDate) {
        this.contractStartDate = contractStartDate;
    }

    public LocalDateTime getContractFinishDate() {
        return contractFinishDate;
    }

    public void setContractFinishDate(LocalDateTime contractFinishDate) {
        this.contractFinishDate = contractFinishDate;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
