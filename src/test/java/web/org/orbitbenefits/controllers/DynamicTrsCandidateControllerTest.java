package web.org.orbitbenefits.controllers;

import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;


public class DynamicTrsCandidateControllerTest {

    private DynamicTrsCandidateController dynamicTrsCandidateController = new DynamicTrsCandidateController();

    @Test
    public void shouldReturnTheNewCandidateForm() {
        //Given

        //When
        ModelAndView modelAndView = dynamicTrsCandidateController.createCandidate();
        //Then
        assertNotNull("ModelAndView should not be null", modelAndView);
        assertThat(modelAndView.getViewName(), is("/admin/dynamic/trs/candidate/create"));
        assertNotNull("Candidate cannot be null", modelAndView.getModelMap().get("candidate"));
    }

}
