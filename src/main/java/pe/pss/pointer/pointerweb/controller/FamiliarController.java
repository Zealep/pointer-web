package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/familiar")
public class FamiliarController {
	
	
	@RequestMapping(value = "/datos")
	public ModelAndView verPrincipal() {
		ModelAndView mav = new ModelAndView("reclutamiento/familiares/listFamiliares");
		return mav;
	}
}
