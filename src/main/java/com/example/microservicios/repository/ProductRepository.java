package com.example.microservicios.repository;

import com.example.microservicios.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<ProductEntity,String> {
}
