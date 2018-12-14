package mypet.fabiolindemberg.com.br.mypet;

import java.util.Objects;

public class Pet {

    private Integer id;
    private String description;
    private Boolean toAdopt;
    private String details;

    public Pet(Integer id, String description, Boolean toAdopt, String details) {
        this.id = id;
        this.description = description;
        this.toAdopt = toAdopt;
        this.details = details;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return Objects.equals(id, pet.id) &&
                Objects.equals(description, pet.description) &&
                Objects.equals(toAdopt, pet.toAdopt) &&
                Objects.equals(details, pet.details);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, description, toAdopt, details);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getToAdopt() {
        return toAdopt;
    }

    public void setToAdopt(Boolean toAdopt) {
        this.toAdopt = toAdopt;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
