package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/laboral")
public class ExperienciaLaboralController {
	
	
	@RequestMapping(value = "/datos")
	public ModelAndView verPrincipal() {
		ModelAndView mav = new ModelAndView("reclutamiento/experiencia-laboral/listExperienciaLab");
		return mav;
	}
	@RequestMapping(value = "/form")
	public ModelAndView verFormulario() {
		ModelAndView mav = new ModelAndView("reclutamiento/experiencia-laboral/formExperienciaLab");
		return mav;
	}
}
