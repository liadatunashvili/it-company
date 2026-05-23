package org.example;

public class Client {
    private Long id;
    private String name;
    private String email;
    private ItCompany itCompany;

    public Client(Long id, String name, String email, ItCompany itCompany) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.itCompany = itCompany;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ItCompany getItCompany() {
        return itCompany;
    }

    public void setItCompany(ItCompany itCompany) {
        this.itCompany = itCompany;
    }
}
