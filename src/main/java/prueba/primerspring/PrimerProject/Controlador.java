package prueba.primerspring.PrimerProject;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import prueba.primerspring.PrimerProject.domain.Persona;
import prueba.primerspring.PrimerProject.servicio.PersonaService;
import jakarta.validation.Valid;  // ← Importante para activar validaciones

@Controller
@Slf4j
public class Controlador {
    
    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        var personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Model model) {
        model.addAttribute("persona", new Persona());
        return "modificar";
    }
    
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, BindingResult result, Model model) {
        // Si hay errores de validación, regresa al formulario
        if (result.hasErrors()) {
            return "modificar";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model) {
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    @GetMapping("/eliminar/{idPersona}")
    public String eliminar(Persona persona) {
        personaService.eliminar(persona);
        return "redirect:/";
    }
}