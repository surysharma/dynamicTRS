package web.org.orbitbenefits.controllers;

import dao.Candidate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by IntelliJ IDEA.
 * User: sureshsharma
 * Date: 15/10/2011
 * Time: 10:35
 * To change this template use File | Settings | File Templates.
 */
@Controller
public class DynamicTrsCandidateController {

    @RequestMapping(value ="/admin/dynamic/trs/candidate/create.html", method = RequestMethod.GET )
    public ModelAndView createCandidate() {
        return new ModelAndView("/admin/dynamic/trs/candidate/create").addObject("candidate", new Candidate());
    }
}
