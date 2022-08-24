package com.portfolio.dalmi.Interface;

import com.portfolio.dalmi.Entity.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    //traer proyecto    
    public List<Proyecto> getProyecto();
    
    // guardar proyecto
    public void saveProyecto(Proyecto proyecto);
    
    //borrar proyecto por id
    public void deleteProyecto(Long id);
    
    // buscar proyecto
    public Proyecto findProyecto(Long id);
   
}
