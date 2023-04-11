/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ap.ap.repository;

import com.ap.ap.models.LoginUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sonia
 */
public interface RLoginUser extends JpaRepository<LoginUser, Long>{
    
}
