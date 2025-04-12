package com.example.microservicios.repository;

import com.example.microservicios.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
 //heredando los atributos de mongorepository 
public interface ProductRepository extends MongoRepository<ProductEntity,String> {
}
