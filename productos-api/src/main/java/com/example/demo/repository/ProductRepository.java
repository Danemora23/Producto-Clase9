package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entitys.Producto;

public interface ProductRepository extends CrudRepository<Producto, Long>{

}
