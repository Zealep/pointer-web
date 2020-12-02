package pe.pss.pointer.pointerweb.service;

import pe.pss.pointer.pointerweb.model.Usuario;

public interface UsuarioService {
	
	public Usuario save(Usuario usuario);
	public String restorePass(String email);
	
}
