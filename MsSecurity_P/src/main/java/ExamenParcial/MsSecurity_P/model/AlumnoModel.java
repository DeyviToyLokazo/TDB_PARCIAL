package ExamenParcial.MsSecurity_P.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="alumno")
public class AlumnoModel {
    @Id
    @Column(name="id_alumno")
    public Integer idAlumno;

    @Column(name="nombre")
    public String nombre;

    @Column(name="nota")
    public Double nota;

}
