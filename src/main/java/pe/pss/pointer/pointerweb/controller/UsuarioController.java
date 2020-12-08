package pe.pss.pointer.pointerweb.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import pe.pss.pointer.pointerweb.business_services.EmailService;
import pe.pss.pointer.pointerweb.model.Usuario;
import pe.pss.pointer.pointerweb.repository.TipoDocumentosIdentidadRespository;
import pe.pss.pointer.pointerweb.service.UsuarioService;
import pe.pss.pointer.pointerweb.util.Constantes;
import pe.pss.pointer.pointerweb.util.ResponseApi;

@RestController
//@CrossOrigin(origins = "*")
@RequestMapping(value = "/usuario")
public class UsuarioController {
	
	@Autowired
	UsuarioService usuarioService;
	
	@Autowired
	TipoDocumentosIdentidadRespository tipoDocumentoRepository;
	
	@Autowired
	EmailService emailService;
	
	@RequestMapping(value = "/alta")
	public ModelAndView formAltaUsuario() {
		ModelAndView mav = new ModelAndView("/usuario/alta-usuario");
		mav.addObject("tipoDocumentos",tipoDocumentoRepository.findAll());
		return mav;
	}
	
	@RequestMapping(value = "/recuperar")
	public ModelAndView formRecuperarUsuario() {
		ModelAndView mav = new ModelAndView("/usuario/recuperar-clave");
		return mav;
	}
	
	@RequestMapping(value = "/add")
	@ResponseBody
	public ResponseApi addUser(@RequestBody Usuario usuario,HttpServletResponse hsr,HttpServletRequest req) throws Exception {

			if(usuarioService.existUser(usuario.getCorreo())) {
				return new ResponseApi(Constantes.RESPONSE_VALIDATION_ERROR, "El usuario ya se encuentra registrado");
			}
			usuarioService.save(usuario);
			return new ResponseApi(Constantes.RESPONSE_OK, "El usuario se registro correctamente");
		
	
	}
	
	@RequestMapping(value = "/send")
	@ResponseBody
	public ResponseApi sendEmail(@RequestParam(value = "email")String correo) {
		if(!usuarioService.existUser(correo)) {
			return new ResponseApi(Constantes.RESPONSE_VALIDATION_ERROR, "El correo no se encuentra registrado");
		}
		
		String clave = usuarioService.restorePass(correo);
		String subject = "RECUPERACION CLAVE ";
		String text = "SU CLAVE ES "+ clave ;
		emailService.sendMailRestorePass(correo, subject, text);
		return new ResponseApi(Constantes.RESPONSE_OK, "La contraseña fue enviada al correo");
		
	}
	
	
}
