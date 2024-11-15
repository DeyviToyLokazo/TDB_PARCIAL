package ExamenParcial.MsSecurity_P.servicios;

import java.util.List;

import ExamenParcial.MsSecurity_P.model.AlumnoModel;

public interface IAlumnoService {
    //CRUD

    public List<AlumnoModel> findAll();
    public AlumnoModel findById(Integer id);
    public AlumnoModel add(AlumnoModel model);
    public AlumnoModel update(AlumnoModel model);
    public Boolean delete(Integer id);
    
}
