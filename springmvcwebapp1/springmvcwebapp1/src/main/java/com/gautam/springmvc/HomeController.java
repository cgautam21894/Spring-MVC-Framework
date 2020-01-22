package com.gautam.springmvc;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.catalina.LifecycleListener;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.gautam.springmvc.model.Alien;

@Controller
public class HomeController {

	// Dispatcher Servlet assign request to respective controller
	@RequestMapping("/")
	public String Home() {
		return "index";
	}

	// Spring will provide both the objects request and session
	/*
	 * @RequestMapping("add") public String add(@RequestParam("num_1") int
	 * i, @RequestParam("num_2") int j, Model m) {
	 * 
	 * // ModelAndView mv = new ModelAndView("result"); // ModelAndView mv = new
	 * ModelAndView(); // mv.setViewName("result"); int res = i + j;
	 * 
	 * m.addAttribute("res", res);
	 * 
	 * return "result";
	 * 
	 * }
	 */

	@GetMapping("getAliens")
	public String getAliens(Model m) {

		java.util.List<Alien> aliens = Arrays.asList(new Alien(101, "gauti"), new Alien(102, "minu"));
		m.addAttribute("result", aliens);

		return "showAliens";

	}

	@PostMapping(value="addAlien")
	public String addAlien(@ModelAttribute Alien a) {
		return "result";
	}



}
