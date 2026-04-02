package prueba.primerspring.PrimerProject.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import jakarta.validation.constraints.NotEmpty;  // ← Importa esta
import jakarta.validation.constraints.Email;     // ← Para validar email
import jakarta.validation.constraints.Size;      // ← Para validar tamaño
import jakarta.validation.constraints.Pattern;   // ← Para validar patrón (teléfono)

@Data
@Entity
@Table(name = "persona")
public class Persona implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPersona;
    
    @NotEmpty(message = "El nombre no puede estar vacío")
    @Size(min = 2, max = 50, message = "El nombre debe tener entre 2 y 50 caracteres ")
    private String nombre;
    
    @NotEmpty(message = "El apellido no puede estar vacío")
    @Size(min = 2, max = 50, message = "El apellido debe tener entre 2 y 50 caracteres ")
    private String apellido;
    
    @NotEmpty(message = "El email no puede estar vacío")
    @Email(message = "El email debe tener un formato válido")
    private String email;
    
    @NotEmpty(message = "El teléfono no puede estar vacío ")
    @Pattern(regexp = "[0-9]{10}", message = "El teléfono debe tener 10 dígitos")
    private String telefono;
}