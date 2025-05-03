package com.example.microservicios.controller;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/categories")
@Getter
@Setter
@RefreshScope
//Refresca todos los datos con la notacion @Value para no tener que estar reiniciando
//la aplicacion

public class CategoryController {

    //inyectando el valor
    @Value("${app.testProp}")
    private String testProp;

    @GetMapping("test-prop")
    public String getTestProp(){
        return this.testProp;
    }
}
