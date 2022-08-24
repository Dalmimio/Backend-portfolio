package com.portfolio.dalmi.Interface;

import com.portfolio.dalmi.Entity.ExperienciaLaboral;
import java.util.List;

/**
 *
 * @author dalim
 */
public interface IExperienciaLaboralService {
     //traer 
    public List<ExperienciaLaboral> getExperienciaLaboral();
    
    //Guardar un obj
    
    public void saveExperienciaLaboral(ExperienciaLaboral experienciaLaboral);
    
    //Eliminar obj  por ID
    
    public void deleteExperienciaLaboral(Long id);
    
    //Buscar por id
    
    public ExperienciaLaboral findExperienciaLaboral(Long id);
}

