
package com.ap.ap.controller;

import com.ap.ap.models.Proyectos;
import com.ap.ap.services.SProyectos;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/proyectos")
public class CProyectos {
    public CProyectos(com.ap.ap.services.SProyectos sProyectos) {
        this.sProyectos = sProyectos;
    }
    private final SProyectos sProyectos;
    
    @GetMapping("/all")
    public ResponseEntity<List<Proyectos>> obtenerProyectos(){
        List<Proyectos> proyectos = sProyectos.buscarProyectos();
        return new ResponseEntity<>(proyectos,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Proyectos> editarProyectos(@RequestBody Proyectos proyecto){
        Proyectos updateProyectos= sProyectos.editarProyectos(proyecto);
        return new ResponseEntity<>(updateProyectos, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Proyectos> crearProyectos(@RequestBody Proyectos proyecto){
        Proyectos nuevaProyectos=sProyectos.addProyectos(proyecto);
        return new ResponseEntity<>(nuevaProyectos, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarProyectos(@PathVariable("id") Long id){
        sProyectos.borrarProyectos(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
