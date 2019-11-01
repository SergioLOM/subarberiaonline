package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.CiudadEntity;
import co.edu.uco.subarberiaonline.model.Ciudad;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CiudadConverter {

    public Ciudad entityToModel(CiudadEntity ciudadEntity){
        var ciudad = new Ciudad();
        ciudad.setId(ciudadEntity.getId());
        ciudad.setNombre(ciudadEntity.getNombre());
        ciudad.setDepartamento(ciudadEntity.getDepartamento());
        return ciudad;
    }

    public CiudadEntity modelToEntity(Ciudad ciudad){
        var ciudadEntity = new CiudadEntity();
        ciudadEntity.setId(ciudad.getId());
        ciudadEntity.setNombre(ciudad.getNombre());
        ciudadEntity.setDepartamento(ciudad.getDepartamento());
        return ciudadEntity;
    }

    public Ciudad entityToModel(Optional<CiudadEntity> ciudadEntity) {
        Ciudad ciudad = null;
        if (ciudadEntity.isPresent()) {
            ciudad = new Ciudad();
            ciudad.setId(ciudadEntity.get().getId());
            ciudad.setNombre(ciudadEntity.get().getNombre());
            ciudad.setDepartamento(ciudadEntity.get().getDepartamento());
            return ciudad;
        }
        return ciudad;
    }
}
