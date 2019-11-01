package co.edu.uco.subarberiaonline.model;

public class Servicio {

    private Long id;
    private String nombre;
    private Barberia barberia;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Barberia getBarberia() { return barberia; }

    public void setBarberia(Barberia barberia) { this.barberia = barberia; }
}
