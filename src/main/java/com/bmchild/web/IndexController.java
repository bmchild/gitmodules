package com.bmchild.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bmchild.service.AwesomeService;

@Controller
public class IndexController {
	
	@Autowired
	private AwesomeService awesomeService;
	
	/**
	 * New Comment and blah blah blah
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ModelAndView index(Model model) {
		ModelAndView mav = new ModelAndView("index");
		mav.addObject("awesome", awesomeService.getAnAwesomeString("BOOYA!"));
		
		return mav;
	}
}
