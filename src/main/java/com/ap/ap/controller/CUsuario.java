
package com.ap.ap.controller;

import com.ap.ap.models.Usuario;
import com.ap.ap.services.SUsuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class CUsuario {

    public CUsuario(com.ap.ap.services.SUsuario sUsuario) {
        this.sUsuario = sUsuario;
    }
    private final SUsuario sUsuario;
    
    @GetMapping("/id/{id}")
    public ResponseEntity<Usuario> obtenerUsuario(@PathVariable("id") Long id){
        Usuario usuario = sUsuario.buscarUsuarioPorId(id);
        return new ResponseEntity<>(usuario,HttpStatus.OK);
    }
    @PutMapping("/update")
    public ResponseEntity<Usuario> editarUsuario(@RequestBody Usuario usuario){
        Usuario updateUsuario= sUsuario.editarUsuario(usuario);
        return new ResponseEntity<>(updateUsuario, HttpStatus.OK);
    }
}
