package pe.pss.pointer.pointerweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import pe.pss.pointer.pointerweb.model.Usuario;
import pe.pss.pointer.pointerweb.service.UsuarioService;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
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
	
	@RequestMapping(value = "/add")
	public void addUser(@RequestBody Usuario usuario,HttpServletResponse hsr,HttpServletRequest req) throws IOException {
		usuarioService.save(usuario);
	}
	
}
