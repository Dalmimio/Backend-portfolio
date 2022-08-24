package com.portfolio.dalmi.Interface;

import com.portfolio.dalmi.Entity.Formacion;
import java.util.List;

/**
 *
 * @author dalim
 */
public interface IFormacionService {
    //traer 
    public List<Formacion> getFormacion();
    
    //Guardar un obj 
    
    public void saveFormacion(Formacion formacion);
    
    //Eliminar obj  por ID
    
    public void deleteFormacion(Long id);
    
    //Buscar  por id
    
    public Formacion findFormacion(Long id);
}
