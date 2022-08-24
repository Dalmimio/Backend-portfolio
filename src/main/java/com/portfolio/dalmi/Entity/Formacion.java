package com.portfolio.dalmi.Entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class Formacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    private Date fin_formacion;
    
    @NotNull
    private Date inicio_formacion;
    
   @NotNull
    @Size(min = 4, max = 50, message = "no cumple con la longitud")
    private String instituto;
   
    @NotNull
    @Size(min = 4, max = 50, message = "no cumple con la longitud")
    private String titulo;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFin_formacion() {
        return fin_formacion;
    }

    public void setFin_formacion(Date fin_formacion) {
        this.fin_formacion = fin_formacion;
    }

    public Date getInicio_formacion() {
        return inicio_formacion;
    }

    public void setInicio_formacion(Date inicio_formacion) {
        this.inicio_formacion = inicio_formacion;
    }

    public String getInstituto() {
        return instituto;
    }

    public void setInstituto(String instituto) {
        this.instituto = instituto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
}
