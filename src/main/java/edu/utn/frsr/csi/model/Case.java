package edu.utn.frsr.csi.model;

import java.util.ArrayList;
import java.util.List;

public class Case {
    private Long id;
    private String name;
    private List<Evidence> evidences = new ArrayList<>();


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

    public List<Evidence> getEvidences() {
        return evidences;
    }

    public void setEvidences(List<Evidence> evidences) {
        this.evidences = evidences;
    }
}
