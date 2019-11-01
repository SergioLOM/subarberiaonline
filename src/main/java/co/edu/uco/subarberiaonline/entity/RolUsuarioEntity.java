package co.edu.uco.subarberiaonline.entity;

import co.edu.uco.subarberiaonline.model.RolUsuario;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "rolusuario")
public class RolUsuarioEntity extends RolUsuario {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;

}
