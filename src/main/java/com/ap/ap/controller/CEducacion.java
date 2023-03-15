
package com.ap.ap.controller;

import com.ap.ap.models.Educacion;
import com.ap.ap.services.SEducacion;
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
@RequestMapping("/educaciones")
public class CEducacion {
    public CEducacion(com.ap.ap.services.SEducacion sEducacion) {
        this.sEducacion = sEducacion;
    }
    
    private final SEducacion sEducacion;
    
    @GetMapping("/all")
    public ResponseEntity<List<Educacion>> obtenerEducacion(){
        List<Educacion> educaciones = sEducacion.buscarEducaciones();
        return new ResponseEntity<>(educaciones,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Educacion> editarEducacion(@RequestBody Educacion educacion){
        Educacion updateEducacion= sEducacion.editarEducacion(educacion);
        return new ResponseEntity<>(updateEducacion, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Educacion> crearExperiencia(@RequestBody Educacion educacion){
        Educacion nuevaExperiencia=sEducacion.addEducacion(educacion);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delte/{id}")
    public ResponseEntity<?> borrarEducacion(@PathVariable("id") Long id){
        sEducacion.borrarEducacion(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
