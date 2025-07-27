package com.project.springbootcourse.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class EjemploRestController {

    @RequestMapping(path = "/detalles_info2", method = RequestMethod.GET)
    public Map<String, Object> detalles_info2() {
        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Titulo", "Servidor en línea");
        respuesta.put("Servidor", "Dulcecr");
        respuesta.put("IP", "191.168.1.1");
        return respuesta;
    }
}
