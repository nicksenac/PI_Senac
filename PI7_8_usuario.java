/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.atividadePI.PI7_8.entities;

/**
 *
 * @author Nicoly Anselmi
 * 
 */

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;


@Entity
@Table(name = "tb_entity")

public class PI7_8_usuario {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String telefone;
    
    @ManyToOne
    @JoinColumn(name = "entity_id")
    private PI7_8_entity entity;
    
    public usuario (){
        
    }

    public <any> getId() {
        return id;
    }

    public void setId(<any> id) {
        this.id = id;
    }

    public <any> getName() {
        return name;
    }

    public void setName(<any> name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public PI7_8_entity getEntity() {
        return entity;
    }

    public void setEntity(PI7_8_entity entity) {
        this.entity = entity;
    }
    
}
