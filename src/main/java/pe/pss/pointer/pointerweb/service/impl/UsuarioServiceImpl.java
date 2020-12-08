package pe.pss.pointer.pointerweb.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.pss.pointer.pointerweb.model.Usuario;
import pe.pss.pointer.pointerweb.repository.UsuarioRepository;
import pe.pss.pointer.pointerweb.service.UsuarioService;
import pe.pss.pointer.pointerweb.util.Constantes;

@Service("usuarioService")
public class UsuarioServiceImpl implements UsuarioService{
	
	@Autowired
	UsuarioRepository usuarioRepository;
	
	
	
	
	@Override
	public Usuario save(Usuario usuario) {
		String pk = usuarioRepository.generatePrimaryKeyUsuario(Constantes.TABLE_POSTULANTE, Constantes.ID_TABLE_POSTULANTE, Constantes.CODIGO_EMPRESA);
		usuario.setIdUsuarioWeb(pk);
		usuario.setEstado(Constantes.ESTADO_ACTIVO);
		usuario.setIdEmpresa(Constantes.CODIGO_EMPRESA);
		return usuarioRepository.save(usuario);
	}

	@Override
	public String restorePass(String email) {
		return usuarioRepository.findPassByEmail(email);
	}
	
	@Override
	public Usuario findByCorreo(String correo) {	
		return usuarioRepository.findByCorreo(correo);
	}

	@Override
	public boolean existUser(String correo) {
		return findByCorreo(correo)!=null?true:false;
	}

	
	

}
