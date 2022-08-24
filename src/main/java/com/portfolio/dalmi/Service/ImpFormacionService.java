package com.portfolio.dalmi.Service;


import com.portfolio.dalmi.Entity.Formacion;
import com.portfolio.dalmi.Interface.IFormacionService;
import com.portfolio.dalmi.Repository.IFormacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpFormacionService implements IFormacionService {
    @Autowired IFormacionRepository iformacionRepository;

    @Override
    public List<Formacion> getFormacion() {
        List<Formacion> formacion = iformacionRepository.findAll();
        return formacion;
    }

    @Override
    public void saveFormacion(Formacion formacion) {
        iformacionRepository.save(formacion);
    }

    @Override
    public void deleteFormacion(Long id) {
        iformacionRepository.deleteById(id);
    }

    @Override
    public Formacion findFormacion(Long id) {
        Formacion formacion = iformacionRepository.findById(id).orElse(null);
        return formacion;
    }
}
