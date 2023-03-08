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
    private int fechaPro;
    private String descPro;
    private String imagenPro;

    public Proyectos() {
    }

    public Proyectos(Long idPro, String tituloPro, int fechaPro, String descPro, String imagenPro) {
        this.idPro = idPro;
        this.tituloPro = tituloPro;
        this.fechaPro = fechaPro;
        this.descPro = descPro;
        this.imagenPro = imagenPro;
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

    public int getFechaPro() {
        return fechaPro;
    }

    public void setFechaPro(int fechaPro) {
        this.fechaPro = fechaPro;
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
    
    
}
