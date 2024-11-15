package ExamenParcial.MsSecurity_P.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ExamenParcial.MsSecurity_P.model.AlumnoModel;

@Repository
public interface IAlumnoRepository extends CrudRepository<AlumnoModel, Integer>{
    
}
