
package com.ap.ap.repository;

import com.ap.ap.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RUsuario extends JpaRepository<Usuario, Long>{
    
}
