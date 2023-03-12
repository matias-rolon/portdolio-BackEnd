
package com.ap.ap.controller;

import com.ap.ap.models.Skills;
import com.ap.ap.services.SSkills;
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
@RequestMapping("/skills")
public class CSkills {
    public CSkills(com.ap.ap.services.SSkills sSkills) {
        this.sSkills = sSkills;
    }
    
    private final SSkills sSkills;
    
    @GetMapping("/all")
    public ResponseEntity<List<Skills>> obtenerSkills(){
        List<Skills> skills = sSkills.buscarSkills();
        return new ResponseEntity<>(skills,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<Skills> editarSkills(@RequestBody Skills skill){
        Skills updateSkills= sSkills.editarSkills(skill);
        return new ResponseEntity<>(updateSkills, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<Skills> crearSkills(@RequestBody Skills skill){
        Skills nuevaSkills=sSkills.addSkills(skill);
        return new ResponseEntity<>(nuevaSkills, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delte/{id}")
    public ResponseEntity<?> borrarSkills(@PathVariable("id") Long id){
        sSkills.borrarSkills(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
