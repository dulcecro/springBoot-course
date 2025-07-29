package com.project.springbootcourse.controller;

import com.project.springbootcourse.models.Empleados;
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
        Empleados empleado1 = new Empleados("Juan", "Rodriguez",
                "av.comas 123","Gerente", 35, 12345678, 001 );

        Map<String, Object> respuesta = new HashMap<>();
        respuesta.put("Empleado", "Datos emmpleado");
        respuesta.put("Información", empleado1);
        return respuesta;
    }
}
