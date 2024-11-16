package ExamenParcial.MsSecurity_P.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ExamenParcial.MsSecurity_P.model.AlumnoModel;
import ExamenParcial.MsSecurity_P.servicios.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;
    
    @GetMapping("/findAll")
    public List<AlumnoModel> mostrarAlumnos(){
        List<AlumnoModel> lista = alumnoService.findAll();
        return lista;
    }

    @PostMapping("/create")
    public AlumnoModel create(@RequestBody AlumnoModel model){
        return alumnoService.add(model);
    }



}
