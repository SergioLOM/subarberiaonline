package co.edu.uco.subarberiaonline.model;

public class Barberia {

    private Long id;
    private String nombre;
    private String nit;
    private Usuario usuario;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getNit() { return nit; }

    public void setNit(String nit) { this.nit = nit; }

    public Usuario getUsuario() { return usuario; }

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
