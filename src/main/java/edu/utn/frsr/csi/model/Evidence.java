package edu.utn.frsr.csi.model;

import java.time.LocalDate;
import java.util.Objects;

public class Evidence {
    private Long id;
    private String description;
    private LocalDate createDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Evidence evidence = (Evidence) o;
        return id.equals(evidence.id) &&
                description.equals(evidence.description) &&
                createDate.equals(evidence.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, createDate);
    }
}
