/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.ap.ap.controller;

import com.ap.ap.models.LoginUser;
import com.ap.ap.services.SLoginUser;
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
@RequestMapping("/loginUser")
public class CLoginUser {
    public CLoginUser(com.ap.ap.services.SLoginUser sLoginUser) {
        this.sLoginUser = sLoginUser;
    }
    
    private final SLoginUser sLoginUser;
    
    @GetMapping("/id/{id}")
    public ResponseEntity<LoginUser> obtenerLoginUser(@PathVariable("id") Long id){
        LoginUser user = sLoginUser.buscarLoginUserPorId(id);
        return new ResponseEntity<>(user ,HttpStatus.OK);
    }
    
    @PutMapping("/update")
    public ResponseEntity<LoginUser> editarLoginUser(@RequestBody LoginUser user){
        LoginUser updateLoginUser= sLoginUser.editarLoginUser(user);
        return new ResponseEntity<>(updateLoginUser, HttpStatus.OK);
    }
    
    @PostMapping("/add")
    public ResponseEntity<LoginUser> crearLoginUsuario(@RequestBody LoginUser user){
        LoginUser nuevoLoginUser=sLoginUser.addLoginUser(user);
        return new ResponseEntity<>(nuevoLoginUser, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> borrarLoginUser(@PathVariable("id") Long id){
        sLoginUser.borrarLoginUser(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
