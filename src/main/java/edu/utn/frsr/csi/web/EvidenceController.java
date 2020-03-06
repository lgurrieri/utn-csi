package edu.utn.frsr.csi.web;

import edu.utn.frsr.csi.model.Evidence;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;

@Controller
public class EvidenceController {

    @RequestMapping("/")
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("today", Date.from(Instant.now()));
        return modelAndView;
    }

    @RequestMapping("/evidencias")
    public ModelAndView evidences(){
        ModelAndView modelAndView = new ModelAndView("evidences");

        ArrayList<Evidence> evidencias = new ArrayList<>();
        Evidence evidence = new Evidence();
        evidence.setCreateDate(LocalDate.now());
        evidence.setDescription("Evidencia 1");
        evidencias.add(evidence);
        modelAndView.addObject("evidences", evidencias);
        return modelAndView;
    }
}
