package com.biblioteca.aulas.biblioteca_aulas.voluntario;

import java.io.Serializable;
import java.util.UUID;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)

@Document(collection = "voluntario")
class Voluntario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @EqualsAndHashCode.Include
    private UUID id;

    private String nome;
    
}