package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@RequestMapping(value="/login",method=RequestMethod.GET)
	public ModelAndView login(ModelAndView mav) {

		mav.setViewName("login");
		return mav;
	}

	@RequestMapping(value="/countrylist",method=RequestMethod.GET)
	public ModelAndView countrylist(ModelAndView mav) {

		mav.setViewName("countrylist");
		return mav;
	}

}
