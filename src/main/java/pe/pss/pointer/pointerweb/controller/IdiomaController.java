package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/idiomas")
public class IdiomaController {
	
	
	@RequestMapping(value = "/datos")
	public ModelAndView verPrincipal() {
		ModelAndView mav = new ModelAndView("reclutamiento/idioma/listIdiomas");
		return mav;
	}
}
