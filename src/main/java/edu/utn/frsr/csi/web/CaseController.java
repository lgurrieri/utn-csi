package edu.utn.frsr.csi.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.time.Instant;

@Controller
public class CaseController {

    @RequestMapping("/casos")
    public ModelAndView showCases(){
        ModelAndView modelAndView = new ModelAndView("now");
        modelAndView.addObject("now", Date.from(Instant.now()));
        return modelAndView;
    }
}
