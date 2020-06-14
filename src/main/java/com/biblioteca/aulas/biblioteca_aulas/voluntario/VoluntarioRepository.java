package com.biblioteca.aulas.biblioteca_aulas.voluntario;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
interface VoluntarioRepository extends MongoRepository<Voluntario, UUID> {
    
}