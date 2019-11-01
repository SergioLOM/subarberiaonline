package co.edu.uco.subarberiaonline.entity;

import co.edu.uco.subarberiaonline.model.Usuario;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Usuario")
public class UsuarioEntity extends Usuario {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @ManyToOne
    @JoinColumn(name = "idDocumentoIdentidad")
    private TipoDocumentoIdentidadEntity tipoDocumentoIdentidadEntity;
    @Column(name = "nroDocumento")
    private String nroDocumento;
    @Column(name = "correo")
    private String correo;
    @Column(name = "contrasena")
    private String contrasena;

}
