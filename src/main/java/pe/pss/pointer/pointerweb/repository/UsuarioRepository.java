package pe.pss.pointer.pointerweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.pss.pointer.pointerweb.model.Usuario;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {

    @Query("select u from Usuario u where u.varUsuario=?1")
    Optional<Usuario> findByUsername(String username);
}
