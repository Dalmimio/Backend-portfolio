package com.portfolio.dalmi.Service;

import com.portfolio.dalmi.Entity.Skills;
import com.portfolio.dalmi.Interface.ISkillsService;
import com.portfolio.dalmi.Repository.ISkillsRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

public class ImpSkillsService implements ISkillsService{
    @Autowired ISkillsRepository iskillsRepository;


    @Override
    public List<Skills> getSkills() {
        List<Skills> skills = iskillsRepository.findAll();
         return skills;
    }

    @Override
    public void saveSkills(Skills skills) {
       iskillsRepository.save(skills);
    }

    @Override
    public void deleteSkills(Long id) {
        iskillsRepository.deleteById(id);
    }

    @Override
    public Skills findSkills(Long id) {
       Skills skills =  iskillsRepository.findById(id).orElse(null);
        return skills;
    }
    
}
