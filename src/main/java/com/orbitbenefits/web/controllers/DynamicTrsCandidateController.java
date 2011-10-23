package com.orbitbenefits.web.controllers;


import com.orbitbenefits.domain.Candidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.orbitbenefits.service.DynamicTrsCandidateService;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 15/10/2011
 * Time: 10:35
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DynamicTrsCandidateController {



    @Autowired
    private DynamicTrsCandidateService dynamicTrsCandidateService;

    @RequestMapping(value ={"/admin/dynamic/trs/candidate/create.html"}, method = RequestMethod.GET )
    public ModelAndView createCandidate() {
        return new ModelAndView("/admin/dynamic/trs/candidate/create").addObject("candidate", new Candidate());
    }

    @RequestMapping(value ={"/admin/dynamic/trs/candidate/create.html"}, method = RequestMethod.POST )
    public ModelAndView submitCandidate(@ModelAttribute Candidate candidate) {
           dynamicTrsCandidateService.createCandidate(candidate);
        return new ModelAndView("redirect:/admin/dynamic/trs/candidate/list.html");
    }

    @RequestMapping(value ={"/admin/dynamic/trs/candidate/list.html"}, method = RequestMethod.GET )
    public ModelAndView listCandidate() {

        return new ModelAndView("/admin/dynamic/trs/candidate/list").addObject("candidates", dynamicTrsCandidateService.getCandidates());
    }
}
