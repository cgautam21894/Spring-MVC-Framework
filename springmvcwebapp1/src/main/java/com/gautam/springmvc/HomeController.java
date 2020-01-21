package com.gautam.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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

	// Spring will provide both the objects request and session
	@RequestMapping("add")
	public String add(@RequestParam("num_1") int i, @RequestParam("num_2") int j, Model m) {

		// ModelAndView mv = new ModelAndView("result");
		// ModelAndView mv = new ModelAndView();
		// mv.setViewName("result");
		int res = i + j;

		m.addAttribute("res", res);

		return "result";

	}

}
