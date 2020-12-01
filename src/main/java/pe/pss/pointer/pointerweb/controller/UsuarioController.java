package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class UsuarioController {
	
	@RequestMapping(value = "/alta-usuario")
	public ModelAndView formAltaUsuario() {
		ModelAndView mav = new ModelAndView("/usuario/alta-usuario");
		return mav;
	}
}
