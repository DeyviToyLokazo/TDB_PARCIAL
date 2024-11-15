package ExamenParcial.MsSecurity_P.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ExamenParcial.MsSecurity_P.model.AlumnoModel;
import ExamenParcial.MsSecurity_P.repository.IAlumnoRepository;

public class AlumnoService implements IAlumnoService{
    @Autowired
    IAlumnoRepository repository;
    @Override

    public List<AlumnoModel> findAll() {
        return (List<AlumnoModel>)repository.findAll();
    }

    @Override
    public AlumnoModel findById(Integer id) {
        return (AlumnoModel)repository.findById(id).get();
    }

    @Override
    public AlumnoModel add(AlumnoModel model) {
        return (AlumnoModel)repository.save(model);
    }

    @Override
    public AlumnoModel update(AlumnoModel model) {
        return (AlumnoModel)repository.save(model);

    }

    @Override
    public Boolean delete(Integer id) {
        repository.deleteById(id);
        return true;
    }
    
}
