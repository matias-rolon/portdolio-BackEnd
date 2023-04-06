
package com.ap.ap.Security.Repository;

import com.ap.ap.Security.Entity.UserLogin;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Repository;

@Repository
public interface RUser extends JpaRepository<UserLogin, Integer>{
    Optional<User> findByNombreUsuario(String nombreUsuario);
    
    boolean existsByNombreUsuario(String nombreUsuario);
    boolean existsByEmail(String email);
}
