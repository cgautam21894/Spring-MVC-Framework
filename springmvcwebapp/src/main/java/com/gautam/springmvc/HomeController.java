package com.gautam.springmvc;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.boot.web.reactive.error.ErrorAttributes;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	// Dispatcher Servlet assign request to respective controller
	@RequestMapping("/")
	public String Home() {
		return "index.jsp";
	}

	/*
	 * Client send request of adding two numbers to the server using request object
	 * and Tomcat server provides HttpServletRequest object(Just like Dependency
	 * Injection or IOC)
	 */

	@RequestMapping("add_old")
	public String add_old(HttpServletRequest req) {

		int i = Integer.parseInt(req.getParameter("num_1"));
		int j = Integer.parseInt(req.getParameter("num_1"));
		int res = i + j;

		// When
		HttpSession session = req.getSession();
		session.setAttribute("res", res);
		return "result.jsp";

	}

	// Spring will provide both the objects request and session
	@RequestMapping("add")
	public String add(@RequestParam("num_1") int i, @RequestParam("num_2") int j, HttpSession session) {

		int res = i + j;

		session.setAttribute("res", res);
		return "result.jsp";

	}

}
