package pe.pss.pointer.pointerweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "rh_tm_menu_web")
public class Menu {
	
	@Id
	@Column(name = "idMenuWeb")
	private String idMenuWeb;
	
	@Column(name = "idModulo")
	private String idModulo;
	
	@Column(name = "nombreMenuWeb")
	private String nombreMenuWeb;
	
	@Column(name = "urlOperacion")
	private String urlOperacion;
	
	@Column(name = "ordenMostrar")
	private int ordenMostrar;
	
	@Column(name = "estado")
	private String estado;
	
	public String getIdMenuWeb() {
		return idMenuWeb;
	}
	public void setIdMenuWeb(String idMenuWeb) {
		this.idMenuWeb = idMenuWeb;
	}
	public String getIdModulo() {
		return idModulo;
	}
	public void setIdModulo(String idModulo) {
		this.idModulo = idModulo;
	}
	public String getNombreMenuWeb() {
		return nombreMenuWeb;
	}
	public void setNombreMenuWeb(String nombreMenuWeb) {
		this.nombreMenuWeb = nombreMenuWeb;
	}
	public String getUrlOperacion() {
		return urlOperacion;
	}
	public void setUrlOperacion(String urlOperacion) {
		this.urlOperacion = urlOperacion;
	}
	public int getOrdenMostrar() {
		return ordenMostrar;
	}
	public void setOrdenMostrar(int ordenMostrar) {
		this.ordenMostrar = ordenMostrar;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
