/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo;


import com.example.models.Taco;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author alsorc
 */

public interface IRepoTaco extends JpaRepository<Taco, Long>{
    
}
