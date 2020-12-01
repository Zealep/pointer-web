package pe.pss.pointer.pointerweb.model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="usuarios")
public class Usuario implements UserDetails{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CompositePKUsuario id;

	@Column(name="varUsuario")
	private String varUsuario;

	@Column(name="varPass")
	private String varPass;

	public CompositePKUsuario getId() {
		return id;
	}

	public void setId(CompositePKUsuario id) {
		this.id = id;
	}

	public String getVarUsuario() {
		return varUsuario;
	}

	public void setVarUsuario(String varUsuario) {
		this.varUsuario = varUsuario;
	}

	public String getVarPass() {
		return varPass;
	}

	public void setVarPass(String varPass) {
		this.varPass = varPass;
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
