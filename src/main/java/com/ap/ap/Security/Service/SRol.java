
package com.ap.ap.Security.Service;

import com.ap.ap.Security.Entity.Rol;
import com.ap.ap.Security.Enums.RolNombre;
import com.ap.ap.Security.Repository.RRol;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SRol {
    @Autowired
    RRol rRol;
    
    public Optional<Rol>getByRolNombre(RolNombre rolNombre){
        return rRol.findByRolNombre(rolNombre);
    }
    
    public void save(Rol rol){
        rRol.save(rol);
    }
}
