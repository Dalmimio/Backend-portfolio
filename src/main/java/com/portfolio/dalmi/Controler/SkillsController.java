package com.portfolio.dalmi.Controler;

import com.portfolio.dalmi.Entity.Skills;
import com.portfolio.dalmi.Interface.ISkillsService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public class SkillsController {
    
    @Autowired ISkillsService iskillsService;
    
    @GetMapping("/skills/traer")
    public List<Skills> getSkills(){
        return iskillsService.getSkills();
    }
    
    @PostMapping("/skills/crear")
    public String createProyecto(@RequestBody Skills skills){
        iskillsService.saveSkills(skills);
        return "skills creado correctamente";
    }
    
    @DeleteMapping("/skills/borrar/{id}")
    public String deteleProyecto(@PathVariable Long id){
        iskillsService.deleteSkills(id);
        return "skills eliminada correctamente";
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public Skills editSkills(@PathVariable Long id,
                               @RequestParam("habilidad") String nuevoHabilidad,
                               @RequestParam("tipo") String nuevoTipo){
    
        Skills skills = iskillsService.findSkills(id);
        
        skills.setHabilidad(nuevoHabilidad);
        skills.setTipo(nuevoTipo);
        
        iskillsService.saveSkills(skills);
        return skills;
    }
    @GetMapping("/skills/crear/perfil")
    public Skills findSkills() {
        return iskillsService.findSkills((long)1);
    }
}
