package com.example.supralternance.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbstractDAO<T> extends JpaRepository<T, Integer> {

    // Nous n'avons plus besoin de définir ces méthodes manuellement.
    // `JpaRepository` gère déjà :
    // - findById
    // - findAll
    // - save (insert ou update)
    // - deleteById
}
