package com.project.springbootcourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EjemploRestController {

    @GetMapping("/detalles_info2")
    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en línea");
        respuesta.put("Servidor", "Dulcecr");
        return respuesta;
    }
}
