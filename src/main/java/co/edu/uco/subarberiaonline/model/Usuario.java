package co.edu.uco.subarberiaonline.model;

public class Usuario {

    private Long id;
    private String nombre;
    private String apellido;
    private TipoDocumentoIdentidad tipoDocumentoIdentidad;
    private String nroDocumento;
    private String correo;
    private String contrasena;
    private RolUsuario rolUsuario;



    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellido() { return apellido; }

    public void setApellido(String apellido) { this.apellido = apellido; }

    public TipoDocumentoIdentidad getTipoDocumentoIdentidad() { return tipoDocumentoIdentidad; }

    public void setTipoDocumentoIdentidad(TipoDocumentoIdentidad documentoIdentidad) { this.tipoDocumentoIdentidad = documentoIdentidad; }

    public String getNroDocumento() { return nroDocumento; }

    public void setNroDocumento(String nroDocumento) { this.nroDocumento = nroDocumento; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }

    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public RolUsuario getRolUsuario() { return rolUsuario; }

    public void setRolUsuario(RolUsuario rolUsuario) { this.rolUsuario = rolUsuario; }
}
