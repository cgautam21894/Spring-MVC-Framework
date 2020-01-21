package com.gautam.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	// Dispatcher Servlet assign request to respective controller
	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	@ModelAttribute
	public void modelData(Model m) {
		m.addAttribute("name","Gautam");
	}

	// Spring will provide both the objects request and session
	@RequestMapping("add")
	public String add(@ModelAttribute Developer developer) {

		// Developer developer = new Developer();
		// developer.setId(id);
		// developer.setName(name);

		return "result";

	}

}
