package pe.pss.pointer.pointerweb.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "usuario")
public class UsuarioController {
	
	@RequestMapping(value = "/alta")
	public ModelAndView formAltaUsuario() {
		ModelAndView mav = new ModelAndView("/usuario/alta-usuario");
		return mav;
	}
	
	@RequestMapping(value = "/recuperar")
	public ModelAndView formRecuperarUsuario() {
		ModelAndView mav = new ModelAndView("/usuario/recuperar-clave");
		return mav;
	}
}
