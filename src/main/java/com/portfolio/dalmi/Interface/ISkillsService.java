package com.portfolio.dalmi.Interface;

import com.portfolio.dalmi.Entity.Skills;
import java.util.List;


public interface ISkillsService {
    
    //traer proyecto    
    public List<Skills> getSkills();
    
    // guardar proyecto
    public void saveSkills(Skills skills);
    
    //borrar proyecto por id
    public void deleteSkills(Long id);
    
    // buscar proyecto
    public Skills findSkills(Long id);
    
}
