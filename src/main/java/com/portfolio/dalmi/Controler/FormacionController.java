package com.portfolio.dalmi.Controler;

import com.portfolio.dalmi.Entity.Formacion;
import com.portfolio.dalmi.Interface.IFormacionService;
import java.util.Date;
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
public class FormacionController {
    @Autowired IFormacionService iformacionService;
    
    @GetMapping("/formacion/traer")
    public List<Formacion> getFormacion(){
        return iformacionService.getFormacion();
    }
    
    @PostMapping("/formacion/crear")
    public String createFormacion(@RequestBody Formacion formacion){
        iformacionService.saveFormacion(formacion);
        return "Formacion creada correctamente";
    }
    
    @DeleteMapping("/formacion/borrar/{id}")
    public String deteleFormacion(@PathVariable Long id){
        iformacionService.deleteFormacion(id);
        return "Formacion eliminada correctamente";
    }
    
    @PutMapping("/formacion/editar/{id}")
    public Formacion editFormacion (@PathVariable Long id,
                               @RequestParam("fin_formacion") Date nuevoFin_formacion,
                               @RequestParam("inicio_formacion") Date nuevoInicio_formacion,
                               @RequestParam("instituto") String nuevoInstituto,
                               @RequestParam("titulo") String nuevoTitulo){
    
        Formacion formacion = iformacionService.findFormacion(id);
        
        formacion.setFin_formacion(nuevoFin_formacion);
        formacion.setInicio_formacion(nuevoInicio_formacion);
        formacion.setInstituto(nuevoInstituto);
        formacion.setTitulo(nuevoTitulo);
        
        iformacionService.saveFormacion(formacion);
        return formacion;
    }
    
    @GetMapping("/formacion/crear/perfil")
    public Formacion findFormacion() {
        return iformacionService.findFormacion((long)1);
    }
    
    
}
