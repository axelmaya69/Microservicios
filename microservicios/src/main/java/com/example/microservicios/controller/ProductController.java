package com.example.microservicios.controller;


import com.example.microservicios.entity.ProductEntity;
import com.example.microservicios.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//notaciones para decir que hara uso de un crud
@RestController
@RequestMapping("/api/products") //indica la api personalizada
public class ProductController {

    //Inyectando dependencia
    @Autowired
    private ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping()
    @ResponseStatus(HttpStatus.OK) //usado para evitar usar el ResponseStatus<>
    public List<ProductEntity> getAllProducts(){
    return productRepository.findAll();
    }
  
    @PostMapping()
    @ResponseStatus(HttpStatus.OK)//usado para evitar usar el ResponseStatus<>
    public void createProduct(@RequestBody ProductEntity productEntity){
    productRepository.save(productEntity);
    }
}
