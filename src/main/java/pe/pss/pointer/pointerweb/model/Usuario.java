package pe.pss.pointer.pointerweb.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="rh_rl_tz_usuario_web")
public class Usuario implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name="idUsuarioWeb")
	private String idUsuarioWeb;

	@Column(name="idEmpresa")
	private String idEmpresa;
	
	@Column(name="idTipoDocumentoIdentidad")
	private String idTipoDocumentoIdentidad;
	
	@Column(name="numeroDocumento")
	private String numeroDocumento;
	
	@Column(name="apellidoPaterno")
	private String apellidoPaterno;
	
	@Column(name="apellidoMaterno")
	private String apellidoMaterno;
	
	@Column(name="nombres")
	private String nombres;
	
	@Column(name="estado")
	private String estado;
	
	@Column(name="correo")
	private String correo;
	
	@Column(name="contraseña")
	private String contraseña;
	

	public String getIdUsuarioWeb() {
		return idUsuarioWeb;
	}

	public void setIdUsuarioWeb(String idUsuarioWeb) {
		this.idUsuarioWeb = idUsuarioWeb;
	}

	public String getIdEmpresa() {
		return idEmpresa;
	}

	public void setIdEmpresa(String idEmpresa) {
		this.idEmpresa = idEmpresa;
	}

	public String getIdTipoDocumentoIdentidad() {
		return idTipoDocumentoIdentidad;
	}

	public void setIdTipoDocumentoIdentidad(String idTipoDocumentoIdentidad) {
		this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		List<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority("ADMIN"));
		return authorities;
	}

	@Override
	public String getPassword() {
		return null;
	}

	@Override
	public String getUsername() {
		return null;
	}


	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	
	
}
