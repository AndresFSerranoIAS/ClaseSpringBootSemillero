package com.example.prueba.service;

import com.example.prueba.dto.PersonaDTO;
import java.util.List;


public interface IpersonaService {
    void save(PersonaDTO persona);
    List<PersonaDTO> getAll();
    String update(PersonaDTO persona);
    void delete(PersonaDTO persona);
}
