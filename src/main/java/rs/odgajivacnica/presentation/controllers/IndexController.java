package rs.odgajivacnica.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import rs.odgajivacnica.AppConstants;
import rs.odgajivacnica.model.entities.Dog;
import rs.odgajivacnica.service.DogService;

import java.util.List;

/**
 * Created by Gile on 8/2/2017.
 */
@Controller
public class IndexController {

    @Autowired
    private DogService dogService;

    @RequestMapping(value = AppConstants.PATH_HOME, method= RequestMethod.GET)
    private String index(){
        return "index";
    }

    @RequestMapping(value=AppConstants.PATH_ABOUT, method= RequestMethod.GET)
    private String about(){
        return "about";
    }

    @RequestMapping(value=AppConstants.PATH_BLOG, method= RequestMethod.GET)
    private String blog(){
        return "blog";
    }

    @RequestMapping(value=AppConstants.PATH_SERVICES, method= RequestMethod.GET)
    private String services(){
        return "services";
    }

    @RequestMapping(value=AppConstants.PATH_SERVICES_MAIN, method= RequestMethod.GET)
    private String servicesMain(){
        return "servicesmain";
    }

    @RequestMapping(value=AppConstants.PATH_DOGS, method= RequestMethod.GET)
    private  ModelAndView dogs(){
        ModelAndView mv = new ModelAndView("dogs");

        List<Dog> list = dogService.getResults(null, 3, 0);
        mv.addObject("results", list);

        return mv;
    }


}
