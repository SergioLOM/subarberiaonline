package co.edu.uco.subarberiaonline.entity;


import co.edu.uco.subarberiaonline.model.Servicio;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "servicio")
public class ServicioEntity extends Servicio {

    @Id
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idBarberia")
    private BarberiaEntity barberia;

}
