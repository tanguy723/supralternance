package com.example.supralternance.service;

import java.util.List;

public interface AbstractService < T > {

    T get( Integer id );

    List< T > getAll();

    T insert( T entity );

    T update( T entity );

    void delete( Integer id );
    
}
