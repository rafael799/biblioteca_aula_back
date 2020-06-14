package com.biblioteca.aulas.biblioteca_aulas.voluntario;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class VoluntarioService {

    private VoluntarioRepository voluntarioRepository;

    public List<Voluntario> getAll(){
        return voluntarioRepository.findAll();
    }
   
    void insert(){
        Voluntario voluntario = new Voluntario();
        voluntario.setId(UUID.randomUUID());
        voluntario.setNome("nome");
        voluntarioRepository.save(voluntario);
    }
    
}