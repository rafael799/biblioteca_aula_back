package com.biblioteca.aulas.biblioteca_aulas.voluntario;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController
@AllArgsConstructor
@RequestMapping("/voluntario")
class VoluntarioApplication {

    private VoluntarioService voluntarioService;

    @GetMapping(value="/getAll")
    List<Voluntario>  getAll() {
        return voluntarioService.getAll();
    }

    @GetMapping(value="/insert")
    void insert() {
         voluntarioService.insert();
    }

}