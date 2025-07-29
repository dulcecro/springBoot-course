package com.project.springbootcourse.controller;

import com.project.springbootcourse.models.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        Empleados empleado1 = new Empleados("Juan", "Rodriguez",
                "av.comas 123","Boss", 35, 12345678, 001 );

        model.addAttribute("empleado1", empleado1);
        return "detalles_info";
    }
}
