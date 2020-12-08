package pe.pss.pointer.pointerweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tipodocumentosidentidad")
public class TipoDocumentosIdentidad {
	
	@Id
	@Column(name = "idTipoDocumentoIdentidad")
	private String idTipoDocumentoIdentidad;
	
	@Column(name = "GlsTipoDocumentoIdentidad")
	private String glsTipoDocumentoIdentidad;
	
	@Column(name = "Siglas")
	private String siglas;

	public String getIdTipoDocumentoIdentidad() {
		return idTipoDocumentoIdentidad;
	}

	public void setIdTipoDocumentoIdentidad(String idTipoDocumentoIdentidad) {
		this.idTipoDocumentoIdentidad = idTipoDocumentoIdentidad;
	}

	public String getGlsTipoDocumentoIdentidad() {
		return glsTipoDocumentoIdentidad;
	}

	public void setGlsTipoDocumentoIdentidad(String glsTipoDocumentoIdentidad) {
		this.glsTipoDocumentoIdentidad = glsTipoDocumentoIdentidad;
	}

	public String getSiglas() {
		return siglas;
	}

	public void setSiglas(String siglas) {
		this.siglas = siglas;
	}
	
	
}
