package com.example.prueba.service.implement;

import com.example.prueba.dto.PersonaDTO;
import com.example.prueba.entity.Persona;
import com.example.prueba.repository.IPersonaRepository;
import com.example.prueba.service.IpersonaService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PersonaServiceImpl implements IpersonaService {
    private final IPersonaRepository repository;

    public PersonaServiceImpl(IPersonaRepository repository) {
        this.repository = repository;
    }

    @Override
    public void save(PersonaDTO persona) {
        repository.save(new Persona(persona));
    }

    @Override
    public List<PersonaDTO> getAll() {
        List<Persona> list =(List<Persona>) repository.findAll();
        return list.stream()
                .map(PersonaDTO::new)
                .collect(Collectors.toList());
    }

    @Override
    public String update(PersonaDTO persona) {
        Optional<Persona> value = repository.findById(persona.getId());
        if(value.isPresent()){
            repository.save(new Persona(persona));
            return "Update";
        }else{
            return "No exist";
        }
    }
}
