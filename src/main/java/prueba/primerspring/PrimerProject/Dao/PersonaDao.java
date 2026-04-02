package prueba.primerspring.PrimerProject.Dao;

import prueba.primerspring.PrimerProject.domain.Persona;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Persona, Long> {
    
}
