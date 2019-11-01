package co.edu.uco.subarberiaonline.model;


public class Ciudad {

    private Long id;
    private String nombre;
    private Departamento departamento;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) { this.nombre = nombre; }

    public Departamento getDepartamento() { return departamento; }

    public void setDepartamento(Departamento departamento) { this.departamento = departamento; }
}
