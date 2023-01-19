package com.example.prueba.entity;

import com.example.prueba.dto.PersonaDTO;
import jakarta.persistence.*;

@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name= "NAME_PERSONA")
    private String name;

    public Persona() {
    }

    public Persona(PersonaDTO personaDTO){
        this.id = personaDTO.getId();
        this.name = personaDTO.getName();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
