
package com.ap.ap.services;

import com.ap.ap.models.Experiencia;
import com.ap.ap.repository.RExperiencia;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SExperiencia {
    private final RExperiencia rExperiencia;
    
    @Autowired
    public SExperiencia(com.ap.ap.repository.RExperiencia rExperiencia) {
        this.rExperiencia = rExperiencia;
    }
    
    public Experiencia addExperiencia(Experiencia experiencia){
        return rExperiencia.save(experiencia);
    }
    
    public List<Experiencia> buscarExperiencias(){
        return rExperiencia.findAll();
    }
    
    public Experiencia editarExperiencia(Experiencia experiencia){
       return rExperiencia.save(experiencia);
    }
    
    public void borrarExperiencia(Long id){
        rExperiencia.deleteById(id);
    }
}
