package pe.pss.pointer.pointerweb.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CompositePKUsuario implements Serializable {

    @Column(name = "idUsuario")
    private String idUsuario;

    @Column(name = "idEmpresa")
    private String idEmpresa;

    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(String idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
}
