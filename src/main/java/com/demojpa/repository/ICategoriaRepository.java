package com.demojpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.demojpa.models.Categoria;

public interface ICategoriaRepository extends JpaRepository<Categoria, Integer> {

}
