
package com.ap.ap.models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class LoginUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idLogin;
    private String email;
    private String password;
    
    @OneToOne(fetch = FetchType.LAZY)
    private Usuario usuario;

    public LoginUser() {
    }

    public LoginUser(Long idLogin, String email, String password) {
        this.idLogin = idLogin;
        this.email = email;
        this.password = password;
    }

    public Long getIdLogin() {
        return idLogin;
    }

    public void setIdLogin(Long idLogin) {
        this.idLogin = idLogin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
}
