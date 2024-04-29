package com.oda.backend.core.backendodaapp.controllers;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.oda.backend.core.backendodaapp.schemas.User;


@RestController
@RequestMapping(value="/api")
public class ProductController {
    @GetMapping(value="/name/{name}")
    public ResponseEntity<?> getName(@PathVariable String name){
        User user = new User(name);
        return ResponseEntity.ok().body("Hola "+user.getName()+" Bienvenido a Spring Boot");
    }
}
