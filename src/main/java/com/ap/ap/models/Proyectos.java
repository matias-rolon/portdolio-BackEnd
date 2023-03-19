package com.ap.ap.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long idPro;
    private String tituloPro;
    private int fechaInicioPro;
    private int fechaFinPro;
    private String descPro;
    private String imagenPro;
    private String urlPro;

    public Proyectos() {
    }

    public Proyectos(Long idPro, String tituloPro, int fechaInicioPro, int fechaFinPro, String descPro, String imagenPro, String urlPro) {
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.fechaInicioPro = fechaInicioPro;
        this.fechaFinPro = fechaFinPro;
        this.descPro = descPro;
        this.imagenPro = imagenPro;
        this.urlPro = urlPro;
    }

    

    public Long getIdPro() {
        return idPro;
    }

    public void setIdPro(Long idPro) {
        this.idPro = idPro;
    }

    public String getTituloPro() {
        return tituloPro;
    }

    public void setTituloPro(String tituloPro) {
        this.tituloPro = tituloPro;
    }

    public int getFechaInicioPro() {
        return fechaInicioPro;
    }

    public void setFechaInicioPro(int fechaInicioPro) {
        this.fechaInicioPro = fechaInicioPro;
    }

    public int getFechaFinPro() {
        return fechaFinPro;
    }

    public void setFechaFinPro(int fechaFinPro) {
        this.fechaFinPro = fechaFinPro;
    }

    

    public String getDescPro() {
        return descPro;
    }

    public void setDescPro(String descPro) {
        this.descPro = descPro;
    }

    public String getImagenPro() {
        return imagenPro;
    }

    public void setImagenPro(String imagenPro) {
        this.imagenPro = imagenPro;
    }

    public String getUrlPro() {
        return urlPro;
    }

    public void setUrlPro(String urlPro) {
        this.urlPro = urlPro;
    }    
}
