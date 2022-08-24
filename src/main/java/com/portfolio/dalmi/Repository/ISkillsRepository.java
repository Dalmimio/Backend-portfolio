package com.portfolio.dalmi.Repository;

import com.portfolio.dalmi.Entity.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ISkillsRepository extends JpaRepository<Skills, Long> {
    
    
}
