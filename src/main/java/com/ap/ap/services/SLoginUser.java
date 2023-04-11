
package com.ap.ap.services;

import com.ap.ap.models.LoginUser;
import com.ap.ap.repository.RLoginUser;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class SLoginUser {
    private final RLoginUser rLoginUser;
    
    @Autowired
    public SLoginUser(com.ap.ap.repository.RLoginUser rLoginUser) {
        this.rLoginUser = rLoginUser;
    }
    
    public LoginUser addLoginUser(LoginUser user){
        return rLoginUser.save(user);
    }
    
    public List<LoginUser> buscarLoginUser(){
        return rLoginUser.findAll();
    }
    
    public LoginUser editarLoginUser(LoginUser user){
        return rLoginUser.save(user);
    }
    
    public void borrarLoginUser(Long id){
        rLoginUser.deleteById(id);
    }
    
    public LoginUser buscarLoginUserPorId(Long id){
        return rLoginUser.findById(id).orElse(null);
    }
}
