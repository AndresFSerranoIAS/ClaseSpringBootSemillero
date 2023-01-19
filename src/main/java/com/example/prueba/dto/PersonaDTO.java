package com.example.prueba.dto;

import com.example.prueba.entity.Persona;

public class PersonaDTO {
    private Integer id;
    private String name;

    public PersonaDTO() {
    }
    public PersonaDTO(Persona persona) {
        this.id = persona.getId();
        this.name = persona.getName();
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
