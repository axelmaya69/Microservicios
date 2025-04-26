package com.example.microservicios.repository;

import com.example.microservicios.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//heredando los atributos de mongorepository
@Repository
public interface ProductRepository extends MongoRepository<ProductEntity,String> {
}
