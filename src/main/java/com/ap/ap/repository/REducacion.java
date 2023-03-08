
package com.ap.ap.repository;

import com.ap.ap.models.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface REducacion extends JpaRepository<Educacion, Long>{
    
}
