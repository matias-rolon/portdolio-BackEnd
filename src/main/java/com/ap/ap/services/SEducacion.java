
package com.ap.ap.services;


import com.ap.ap.models.Educacion;
import com.ap.ap.repository.REducacion;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SEducacion {
    private final REducacion rEducacion;
    
    @Autowired
    public SEducacion(com.ap.ap.repository.REducacion rEducacion) {
        this.rEducacion = rEducacion;
    }
    
    public Educacion addEducacion(Educacion edu){
        return rEducacion.save(edu);
    }
    
    public List<Educacion> buscarEducaciones(){
        return rEducacion.findAll();
    }
    
    public Educacion editarEducacion(Educacion educacion){
       return rEducacion.save(educacion);
    }
    
    public void borrarEducacion(Long id){
        rEducacion.deleteById(id);
    }
}
