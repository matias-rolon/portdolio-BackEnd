
package com.ap.ap.services;

import com.ap.ap.models.Skills;
import com.ap.ap.repository.RSkills;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SSkills {
    
    private final RSkills rSkills;
    @Autowired
    public SSkills(com.ap.ap.repository.RSkills rSkills) {
        this.rSkills = rSkills;
    }
    
    public Skills addSkills(Skills skill){
        return rSkills.save(skill);
    }
    
    public List<Skills> buscarSkills(){
        return rSkills.findAll();
    }
    
    public Skills editarSkills(Skills skill){
       return rSkills.save(skill);
    }
    
    public void borrarSkills(Long id){
        rSkills.deleteById(id);
    }
    
}
