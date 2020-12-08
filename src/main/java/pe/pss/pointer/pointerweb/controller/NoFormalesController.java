package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/no-formales")
public class NoFormalesController {
	
	
	@RequestMapping(value = "/datos")
	public ModelAndView verPrincipal() {
		ModelAndView mav = new ModelAndView("reclutamiento/educacion-noformal/listEduNoFormal");
		return mav;
	}
}
