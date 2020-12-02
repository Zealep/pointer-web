package pe.pss.pointer.pointerweb.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.pss.pointer.pointerweb.model.Usuario;
import pe.pss.pointer.pointerweb.repository.UsuarioRepository;
import pe.pss.pointer.pointerweb.service.UsuarioService;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	@Override
	public Usuario save(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}

	@Override
	public String restorePass(String email) {
		return usuarioRepository.findPassByEmail(email);
	}

}
