package com.example.supralternance.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface AbstractDAO<T, ID> extends JpaRepository<T, ID> {

}
