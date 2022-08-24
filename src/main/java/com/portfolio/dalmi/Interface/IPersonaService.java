
package com.portfolio.dalmi.Interface;

import com.portfolio.dalmi.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    //traer personas
    public List<Persona> getPersona();
    
    //Guardar un obj tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar obj usuario por ID
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
    
    
    
    
    

}
