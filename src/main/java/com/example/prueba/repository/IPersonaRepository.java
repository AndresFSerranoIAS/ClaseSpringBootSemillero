package com.example.prueba.repository;

import com.example.prueba.entity.Persona;
import org.springframework.data.repository.CrudRepository;

public interface IPersonaRepository extends CrudRepository<Persona,Integer> {

}
