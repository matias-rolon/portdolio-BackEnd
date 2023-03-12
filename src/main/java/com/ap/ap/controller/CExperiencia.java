
package com.ap.ap.controller;

import com.ap.ap.models.Experiencia;
import com.ap.ap.services.SExperiencia;
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
@RequestMapping("/experiencias")
public class CExperiencia {
    public CExperiencia(com.ap.ap.services.SExperiencia sExperiencia) {
        this.sExperiencia = sExperiencia;
    }
    private final SExperiencia sExperiencia;
    
    @GetMapping("/all")
    public ResponseEntity<List<Experiencia>> obtenerExperiencia(){
        List<Experiencia> experiencias = sExperiencia.buscarExperiencias();
        return new ResponseEntity<>(experiencias,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Experiencia> editarExperiencia(@RequestBody Experiencia experiencia){
        Experiencia updateExperiencia= sExperiencia.editarExperiencia(experiencia);
        return new ResponseEntity<>(updateExperiencia, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Experiencia> crearExperiencia(@RequestBody Experiencia experiencia){
        Experiencia nuevaExperiencia=sExperiencia.addExperiencia(experiencia);
        return new ResponseEntity<>(nuevaExperiencia, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delte/{id}")
    public ResponseEntity<?> borrarExperiencia(@PathVariable("id") Long id){
        sExperiencia.borrarExperiencia(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
