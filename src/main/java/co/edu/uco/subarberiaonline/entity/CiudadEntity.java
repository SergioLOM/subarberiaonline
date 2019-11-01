package co.edu.uco.subarberiaonline.entity;

import co.edu.uco.subarberiaonline.model.Ciudad;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "ciudad")
public class CiudadEntity extends Ciudad {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idDepartamento")
    private DepartamentoEntity departamento;

}
