package prueba.primerspring.PrimerProject.servicio;

import java.util.List;
import prueba.primerspring.PrimerProject.domain.Persona;

public interface PersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar(Persona persona);
    
    public void eliminar(Persona persona);
    
    public Persona encontrarPersona(Persona persona);
}