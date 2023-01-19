package com.example.prueba.controller;

import com.example.prueba.dto.PersonaDTO;
import com.example.prueba.entity.Persona;
import com.example.prueba.service.IpersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    private final IpersonaService iPersonaService;

    public PersonaController(IpersonaService iPersonaService) {
        this.iPersonaService = iPersonaService;
    }

    @GetMapping()
    public ResponseEntity<?> getPersonAll(){
        return new ResponseEntity<>(iPersonaService.getAll(), HttpStatus.OK);
    }
    @PostMapping()
    public ResponseEntity<?> addPerson(@RequestBody PersonaDTO persona){
        iPersonaService.save(persona);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping()
    public ResponseEntity<?> changePerson(@RequestBody PersonaDTO persona){
        return new ResponseEntity<>(iPersonaService.update(persona),HttpStatus.OK);
    }
    @DeleteMapping()
    public ResponseEntity<?> erasePerson(@RequestBody PersonaDTO persona){
        iPersonaService.delete(persona);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
