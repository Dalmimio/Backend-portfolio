package com.portfolio.dalmi.Entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 4, max = 50, message = "no cumple con la longitud")
    private String nombre;
    
    @NotNull
    @Size(min = 4, max = 50, message = "no cumple con la longitud")
    private String apellido;
    
    @NotNull
    @Size(max = 600)
    private String acercade;
    
    @NotNull
    @Size(min = 15, max = 50, message = "no cumple con la longitud")
    private String email;
    
    @NotNull
    @Size(min = 4, max = 50, message = "no cumple con la longitud")
    private String localizacion;
    
    @NotNull
    @Size(max = 110)
    private String breve_descripcion;
    
    @NotNull
    @Size(max = 100, message = "no cumple con la longitud")
    private String url_img_perfil;
    
    @NotNull
    @Size(max = 100, message = "no cumple con la longitud")
    private String url_img_about;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getAcercade() {
        return acercade;
    }

    public void setAcercade(String acercade) {
        this.acercade = acercade;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getBreve_descripcion() {
        return breve_descripcion;
    }

    public void setBreve_descripcion(String breve_descripcion) {
        this.breve_descripcion = breve_descripcion;
    }

    public String getUrl_img_perfil() {
        return url_img_perfil;
    }

    public void setUrl_img_perfil(String url_img_perfil) {
        this.url_img_perfil = url_img_perfil;
    }

    public String getUrl_img_about() {
        return url_img_about;
    }

    public void setUrl_img_about(String url_img_about) {
        this.url_img_about = url_img_about;
    }
    
    
    
    
    
    
    
    
}






