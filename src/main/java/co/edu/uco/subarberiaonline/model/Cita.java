package co.edu.uco.subarberiaonline.model;

import java.util.Date;

public class Cita {

    private Long id;
    private Date fecha;
    private String hora;
    private Usuario usuario;
    private Barberia barberia;
    private Servicio servicio;

    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Date getFecha() { return fecha; }

    public void setFecha(Date fecha) { this.fecha = fecha; }

    public String getHora() { return hora; }

    public void setHora(String hora) { this.hora = hora; }

    public Usuario getUsuario() { return usuario; }

    public void setUsuario(Usuario usuario) { this.usuario = usuario; }

    public Barberia getBarberia() { return barberia; }

    public void setBarberia(Barberia barberia) { this.barberia = barberia; }

    public Servicio getServicio() { return servicio; }

    public void setServicio(Servicio servicio) { this.servicio = servicio; }

}
