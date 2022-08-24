package com.portfolio.dalmi.Service;

import com.portfolio.dalmi.Entity.ExperienciaLaboral;
import com.portfolio.dalmi.Interface.IExperienciaLaboralService;
import com.portfolio.dalmi.Repository.IExperienciaLaboralRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExperienciaLaboralService implements IExperienciaLaboralService {
    @Autowired IExperienciaLaboralRepository iexperienciaLaboralRepository;
    
    @Override
    public List<ExperienciaLaboral> getExperienciaLaboral() {
        List<ExperienciaLaboral> experienciaLaboral = iexperienciaLaboralRepository.findAll();
        return experienciaLaboral;
    }  

    @Override
    public void saveExperienciaLaboral(ExperienciaLaboral experienciaLaboral) {
        iexperienciaLaboralRepository.save(experienciaLaboral);
    }

    @Override
    public void deleteExperienciaLaboral(Long id) {
         iexperienciaLaboralRepository.deleteById(id);
    }

    @Override
    public ExperienciaLaboral findExperienciaLaboral(Long id) {
        ExperienciaLaboral experienciLaboral = iexperienciaLaboralRepository.findById(id).orElse(null);
        return experienciLaboral;
    }
}
