package pe.pss.pointer.pointerweb.repository;

import java.util.List;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.pss.pointer.pointerweb.model.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu,String>{
	
}
