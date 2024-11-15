package ExamenParcial.MsSecurity_P.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ExamenParcial.MsSecurity_P.model.AlumnoModel;

@RestController
@RequestMapping("alumno")
public class AlumnoController {
    
    @GetMapping("/saludo")
    public String Saludo(){
        
        return "Hola mundo";
    }
}
