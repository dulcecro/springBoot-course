package com.project.springbootcourse.controller;

import com.project.springbootcourse.models.DTO.ClaseDTO;
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
    public ClaseDTO detalles_info2() {
        ClaseDTO usuario = new ClaseDTO();
        usuario.setTitulo("Administrador");
        usuario.setUsuario("admin");
        return usuario;
    }
}
