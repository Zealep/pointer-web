package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;

@RestController
public class MainController {

	ModelAndView mavIndex = new ModelAndView("index"); // Goruntulenecek sayfanin adi (view page name)

	@RequestMapping(value = "/")
	public ModelAndView index(Principal principal) {
		String user = principal.getName();
		mavIndex.addObject("principal", user);
		return mavIndex;
	}

	@RequestMapping(value = "/login")
	public ModelAndView login() {
		mavIndex.addObject("mod", "HIDE_RECORDS");
		return new ModelAndView("login");
	}


}