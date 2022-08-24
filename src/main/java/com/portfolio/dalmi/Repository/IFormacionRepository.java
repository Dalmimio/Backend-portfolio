package com.portfolio.dalmi.Repository;

import com.portfolio.dalmi.Entity.Formacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IFormacionRepository extends JpaRepository<Formacion,Long>{
        

}
