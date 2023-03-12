
package com.ap.ap.services;

import com.ap.ap.models.Proyectos;
import com.ap.ap.repository.RProyectos;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SProyectos {
    private final RProyectos rProyectos;
    
    @Autowired
    public SProyectos(com.ap.ap.repository.RProyectos rProyectos) {
        this.rProyectos = rProyectos;
    }

    public Proyectos addProyectos(Proyectos proyecto){
        return rProyectos.save(proyecto);
    }
    
    public List<Proyectos> buscarProyectos(){
        return rProyectos.findAll();
    }
    
    public Proyectos editarProyectos(Proyectos Proyecto){
       return rProyectos.save(Proyecto);
    }
    
    public void borrarProyectos(Long id){
        rProyectos.deleteById(id);
    }
}
