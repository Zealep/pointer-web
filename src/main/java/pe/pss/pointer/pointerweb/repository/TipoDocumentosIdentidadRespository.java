package pe.pss.pointer.pointerweb.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.pss.pointer.pointerweb.model.TipoDocumentosIdentidad;

@Repository
public interface TipoDocumentosIdentidadRespository extends JpaRepository<TipoDocumentosIdentidad, String>{
		

}
