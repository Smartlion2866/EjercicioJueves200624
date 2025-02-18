package com.example.examen.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import com.example.examen.entity.Libro;

public interface LibroRepository extends MongoRepository<Libro, Integer> {
    
    @Query("{categories:{$regex: \"^Internet$\" }}")
    public abstract List<Libro> listaLibrosPorCategoria(String categoria);
}
