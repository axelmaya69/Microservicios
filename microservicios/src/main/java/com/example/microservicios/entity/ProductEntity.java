package com.example.microservicios.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value = "product")//definiendo que sera un documento en mongodb
@Getter //Añadiendo Getters y Setters
@Setter
@NoArgsConstructor //Se pide construir un constructor sin argumentos
public class ProductEntity {

    @Id
    private String id;

    private String productName;

    private String productDescription;

    private Double unitPrice;


}
