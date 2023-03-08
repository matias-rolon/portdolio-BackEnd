
package com.ap.ap.repository;

import com.ap.ap.models.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RSkills extends JpaRepository<Skills, Long>{
    
}
