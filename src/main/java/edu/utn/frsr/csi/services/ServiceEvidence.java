package edu.utn.frsr.csi.services;

import edu.utn.frsr.csi.model.Evidence;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServiceEvidence {

    private ArrayList<Evidence> evidences = new ArrayList<>();

    public ServiceEvidence(){
        Evidence evidence = new Evidence();
        evidence.setId(1L);
        evidence.setCreateDate(LocalDate.now());
        evidence.setDescription("Evidencia Nº 1");
        evidences.add(evidence);
    }

    public List<Evidence> getAllEvidences(){

        return evidences;
    }

    public void addEvidence(Evidence evidence) {
        evidence.setId(evidences.size()+1L);
        evidence.setCreateDate(LocalDate.now());
        this.evidences.add(evidence);
    }

    public Evidence getEvidence(Long id){
        return evidences.stream().filter(evidence -> evidence.getId().equals(id)).findAny().orElse(null);
    }

    public void replaceEvidence(Evidence evidence) {

    }
}
