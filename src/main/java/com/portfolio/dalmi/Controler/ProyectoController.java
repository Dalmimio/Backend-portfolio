package com.portfolio.dalmi.Controler;

import com.portfolio.dalmi.Entity.Proyecto;
import com.portfolio.dalmi.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
    
    @GetMapping("/proyecto/traer")
    public List<Proyecto> getProyecto(){
        return iproyectoService.getProyecto();
    }
    
    @PostMapping("/proyecto/crear")
    public String createProyecto(@RequestBody Proyecto proyecto){
        iproyectoService.saveProyecto(proyecto);
        return "El proyecto fue creado correctamente";
    }
    
    @DeleteMapping("/proyecto/borrar/{id}")
    public String deteleProyecto(@PathVariable Long id){
        iproyectoService.deleteProyecto(id);
        return "El proyecto fue eliminada correctamente";
    }
    
    @PutMapping("/proyecto/editar/{id}")
    public Proyecto editProyecto(@PathVariable Long id,
                               @RequestParam("nombreProyecto") String nuevoNombreProyecto,
                               @RequestParam("descripcionProyecto") String nuevoDescripcionProyecto){
    
        Proyecto proyecto = iproyectoService.findProyecto(id);
        
        proyecto.setNombreProyecto(nuevoNombreProyecto);
        proyecto.setDescripcionProyecto(nuevoDescripcionProyecto);
        
        iproyectoService.saveProyecto(proyecto);
        return proyecto;
    }
    
    @GetMapping("/proyecto/crear/perfil")
    public Proyecto findProyecto() {
        return iproyectoService.findProyecto((long)1);
    }
    
}
