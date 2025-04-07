package com.example.supralternance.repository;

import java.util.List;

import org.springframework.data.repository.query.Param;

public interface AbstractDAO < T > {
    
    T get( @Param( "id" ) final Integer id );


    List< T > getAll();

    T insert( @Param( "entity") final T entite);

    T update( @Param( "entity") final T entite);

    Integer delete( @Param( "id" ) final Integer id);
}
