
package com.ap.ap.Security.Service;

import com.ap.ap.Security.Entity.UserLogin;
import com.ap.ap.Security.Repository.RUser;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SUser {
    @Autowired
    RUser rUser;
    public Optional<UserLogin> getByNombreUsuario(String nombreUsuario){
        return rUser.findByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByNombreUsuario(String nombreUsuario){
        return rUser.existsByNombreUsuario(nombreUsuario);
    }
    
    public boolean existsByEmail(String email){
        return rUser.existsByEmail(email);
    }
    
    public void save(UserLogin usuario){
        rUser.save(usuario);
    }
}
