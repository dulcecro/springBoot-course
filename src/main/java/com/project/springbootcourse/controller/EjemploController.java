package com.project.springbootcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EjemploController {

    @GetMapping("/detalles_info")
    public String info(Model model) {
        model.addAttribute("Titulo", "Servidor en línea");
        model.addAttribute("Servidor", "Dulcecr");
        return "detalles_info";
    }
}
