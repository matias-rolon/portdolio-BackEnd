
package com.ap.ap.services;

import com.ap.ap.models.Usuario;
import com.ap.ap.repository.RUsuario;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SUsuario {
    private final RUsuario rUsuario;
    @Autowired
    public SUsuario(com.ap.ap.repository.RUsuario rUsuario) {
        this.rUsuario = rUsuario;
    }
    
    public Usuario addUsuario(Usuario user){
        return rUsuario.save(user);
    }
    
    public List<Usuario> buscarUsuarios(){
        return rUsuario.findAll();
    }
    
    public Usuario editarUsuario(Usuario user){
       return rUsuario.save(user);
    }
    
    public void borrarUsuario(Long id){
        rUsuario.deleteById(id);
    }
    
    public Usuario buscarUsuarioPorId(Long id){
        return rUsuario.findById(id).orElse(null);
    }
}
