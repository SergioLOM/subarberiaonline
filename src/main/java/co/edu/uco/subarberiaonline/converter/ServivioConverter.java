package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.ServicioEntity;
import co.edu.uco.subarberiaonline.model.Servicio;

import java.util.Optional;

public class ServivioConverter {

    public Servicio entityToModel(ServicioEntity servicioEntity){
        var servicio = new Servicio();
        servicio.setId(servicioEntity.getId());
        servicio.setNombre(servicioEntity.getNombre());
        servicio.setBarberia(servicioEntity.getBarberia());
        return servicio;
    }

    public ServicioEntity modelToEntity(Servicio servicio){
        var servicioEntity = new ServicioEntity();
        servicioEntity.setId(servicio.getId());
        servicioEntity.setNombre(servicio.getNombre());
        servicioEntity.setBarberia(servicio.getBarberia());
        return servicioEntity;
    }

    public Servicio entityToModel(Optional<ServicioEntity> servicioEntity) {
        Servicio servicio = null;
        if (servicioEntity.isPresent()) {
            servicio = new Servicio();
            servicio.setId(servicioEntity.get().getId());
            servicio.setNombre(servicioEntity.get().getNombre());
            servicio.setBarberia(servicioEntity.get().getBarberia());
            return servicio;
        }
        return servicio;
    }
}
