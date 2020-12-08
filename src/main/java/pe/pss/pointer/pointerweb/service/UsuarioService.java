package pe.pss.pointer.pointerweb.service;

import pe.pss.pointer.pointerweb.model.Usuario;

public interface UsuarioService {
	
	public Usuario findByCorreo(String correo);
	public Usuario save(Usuario usuario);
	public String restorePass(String email);
	public boolean existUser(String correo);
	
}
