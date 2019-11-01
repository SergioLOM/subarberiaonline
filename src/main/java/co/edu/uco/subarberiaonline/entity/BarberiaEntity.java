package co.edu.uco.subarberiaonline.entity;

import co.edu.uco.subarberiaonline.model.Barberia;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "barberia")
public class BarberiaEntity extends Barberia {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nit")
    private String nit;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario;
}
