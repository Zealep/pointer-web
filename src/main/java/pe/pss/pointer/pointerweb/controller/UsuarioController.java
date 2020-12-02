package pe.pss.pointer.pointerweb.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import pe.pss.pointer.pointerweb.business_services.EmailService;
import pe.pss.pointer.pointerweb.model.Usuario;
import pe.pss.pointer.pointerweb.service.UsuarioService;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	EmailService emailService;
	
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
	
	@RequestMapping(value = "/send")
	public void sendEmail(@RequestParam(value = "email")String correo) {
		String clave = usuarioService.restorePass(correo);
		String subject = "RECUPERACION CLAVE ";
		String text = "SU CLAVE ES "+ clave ;
		emailService.sendMailRestorePass(correo, subject, text);
		
	}
	
}
