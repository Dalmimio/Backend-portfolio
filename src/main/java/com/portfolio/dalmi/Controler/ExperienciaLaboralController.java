package com.portfolio.dalmi.Controler;

import com.portfolio.dalmi.Entity.ExperienciaLaboral;
import com.portfolio.dalmi.Interface.IExperienciaLaboralService;
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
public class ExperienciaLaboralController {
    
    @Autowired IExperienciaLaboralService iexperienciaLaboralService;
    
    @GetMapping("/experienciaLaboral/traer")
    public List<ExperienciaLaboral> getExperienciaLaboral(){
        return iexperienciaLaboralService.getExperienciaLaboral();
    }
    
    @PostMapping("/experienciaLaboral/crear")
    public String createExperienciaLaboral(@RequestBody ExperienciaLaboral experienciaLaboral){
        iexperienciaLaboralService.saveExperienciaLaboral(experienciaLaboral);
        return "Experiencia Labora creada correctamente";
    }
    
    @DeleteMapping("/experienciaLaboral/borrar/{id}")
    public String deteleExperienciaLabora(@PathVariable Long id){
        iexperienciaLaboralService.deleteExperienciaLaboral(id);
        return "Experiencia Labora eliminada correctamente";
    }
    
    @PutMapping("/experienciaLaboral/editar/{id}")
    public ExperienciaLaboral editExperienciaLaboral (@PathVariable Long id,
                               @RequestParam("puesto") String nuevoPuesto,
                               @RequestParam("empresa") String nuevoEmpresa,
                               @RequestParam("inicio") Date nuevoInicio,
                               @RequestParam("fin") Date nuevoFin){
    
        ExperienciaLaboral experienciaLaboral = iexperienciaLaboralService.findExperienciaLaboral(id);
        
        experienciaLaboral.setPuesto(nuevoPuesto);
        experienciaLaboral.setEmpresa(nuevoEmpresa);
        experienciaLaboral.setInicio(nuevoInicio);
        experienciaLaboral.setFin(nuevoFin);
        
        iexperienciaLaboralService.saveExperienciaLaboral(experienciaLaboral);
        return experienciaLaboral;
    }
    
    @GetMapping("/experienciaLaboral/crear/perfil")
    public ExperienciaLaboral findExperienciaLaboral() {
        return iexperienciaLaboralService.findExperienciaLaboral((long)1);
    }
    
}
