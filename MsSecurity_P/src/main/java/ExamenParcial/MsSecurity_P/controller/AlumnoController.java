package ExamenParcial.MsSecurity_P.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/findById/{id}")
    public AlumnoModel findById(@PathVariable Integer id) {
        return alumnoService.findById(id);
    }

    @PutMapping("/update")
    public AlumnoModel update(@RequestBody AlumnoModel model){
    return alumnoService.update(model);
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        boolean isDeleted = alumnoService.delete(id);
        return isDeleted ? "Usuario eliminado correctamente" : "Error al eliminar usuario";
    }

}
