package edu.sjsu.dev.portal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/dev")
public class BaseController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String startPage(ModelMap model) {
		return "index";
	}
}
