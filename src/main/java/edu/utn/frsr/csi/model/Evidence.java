package edu.utn.frsr.csi.model;

import java.time.LocalDate;

public class Evidence {
    private String description;
    private LocalDate createDate;

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
}
