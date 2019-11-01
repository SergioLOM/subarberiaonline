package co.edu.uco.subarberiaonline.entity;

import co.edu.uco.subarberiaonline.model.Departamento;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "departamento")
public class DepartamentoEntity extends Departamento {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;

}
