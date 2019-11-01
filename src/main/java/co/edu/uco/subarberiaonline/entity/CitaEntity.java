package co.edu.uco.subarberiaonline.entity;

import co.edu.uco.subarberiaonline.model.Cita;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "cita")
public class CitaEntity extends Cita {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "fecha")
    private Date fecha;
    @Column(name = "hora")
    private String hora;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private UsuarioEntity usuario;
    @ManyToOne
    @JoinColumn(name = "idBarberia")
    private BarberiaEntity barberia;
    @ManyToOne
    @JoinColumn(name = "idServicio")
    private ServicioEntity servicio;

}
