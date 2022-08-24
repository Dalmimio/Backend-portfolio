package com.portfolio.dalmi.Controler;

import com.portfolio.dalmi.Entity.Persona;
import com.portfolio.dalmi.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService ipersonaService;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return ipersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        ipersonaService.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaService.deletePersona(id);
        return "La persona fue eliminada correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("acercade") String nuevoAcercaDe,
                               @RequestParam("email") String nuevoEmail,
                               @RequestParam("localizacion") String nuevoLocalizacion,
                               @RequestParam("breve_descripcion") String nuevoBreve_descripcion,
                               @RequestParam("url_img_perfil") String nuevoUrl_img_perfil,
                               @RequestParam("url_img_about") String nuevoUrl_img_about){
    
        Persona persona = ipersonaService.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setAcercade(nuevoAcercaDe);
        persona.setEmail(nuevoEmail);
        persona.setLocalizacion(nuevoLocalizacion);
        persona.setBreve_descripcion(nuevoBreve_descripcion);
        persona.setUrl_img_perfil(nuevoUrl_img_perfil);
        persona.setUrl_img_about(nuevoUrl_img_about);
        
        ipersonaService.savePersona(persona);
        return persona;
        
    }
    
    @GetMapping("/personas/crear/perfil")
    public Persona findPersona() {
        return ipersonaService.findPersona((long)1);
    } 
    
    
    
}
