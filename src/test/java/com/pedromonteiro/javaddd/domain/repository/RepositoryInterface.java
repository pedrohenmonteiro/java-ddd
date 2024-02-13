package com.pedromonteiro.javaddd.domain.repository;

import java.util.List;
import java.util.Optional;

public interface RepositoryInterface<T> {
    public void create(T t);
    public void update(T t);
    public Optional<T> findById(String id);
    public List<T> findAll(); 
    
}