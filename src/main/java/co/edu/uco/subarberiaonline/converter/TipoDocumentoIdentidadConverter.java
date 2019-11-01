package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.TipoDocumentoIdentidadEntity;
import co.edu.uco.subarberiaonline.model.TipoDocumentoIdentidad;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class TipoDocumentoIdentidadConverter {

    public TipoDocumentoIdentidad entityToModel(TipoDocumentoIdentidadEntity tipoDocumentoIdentidadEntity){
        var tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
        tipoDocumentoIdentidad.setId(tipoDocumentoIdentidadEntity.getId());
        tipoDocumentoIdentidad.setNombre(tipoDocumentoIdentidadEntity.getNombre());
        tipoDocumentoIdentidad.setSigla(tipoDocumentoIdentidadEntity.getSigla());
        tipoDocumentoIdentidad.setActivo(tipoDocumentoIdentidadEntity.isActivo());
        return tipoDocumentoIdentidad;
    }

    public TipoDocumentoIdentidadEntity modelToEntity(TipoDocumentoIdentidad tipoDocumentoIdentidad){
        var tipoDocumentoIdentidadEntity = new TipoDocumentoIdentidadEntity();
        tipoDocumentoIdentidadEntity.setId(tipoDocumentoIdentidad.getId());
        tipoDocumentoIdentidadEntity.setNombre(tipoDocumentoIdentidad.getNombre());
        tipoDocumentoIdentidadEntity.setSigla(tipoDocumentoIdentidad.getSigla());
        tipoDocumentoIdentidadEntity.setActivo(tipoDocumentoIdentidad.isActivo());

        return tipoDocumentoIdentidadEntity;
    }

    public List<TipoDocumentoIdentidad> entityToModel(List<TipoDocumentoIdentidadEntity> tipoDocumentoIdentidadEntity) {
        List<TipoDocumentoIdentidad> tiposDocumentoIdentidad = new ArrayList<>(tipoDocumentoIdentidadEntity.size());
        tipoDocumentoIdentidadEntity.forEach(entity -> {
            tiposDocumentoIdentidad.add(entityToModel(entity));
        });
        return tiposDocumentoIdentidad;
    }

    public TipoDocumentoIdentidad entityToModel(Optional<TipoDocumentoIdentidadEntity> tipoDocumentoIdentidadEntity) {
        TipoDocumentoIdentidad tipoDocumentoIdentidad = null;
        if (tipoDocumentoIdentidadEntity.isPresent()) {
            tipoDocumentoIdentidad = new TipoDocumentoIdentidad();
            tipoDocumentoIdentidad.setId(tipoDocumentoIdentidadEntity.get().getId());
            tipoDocumentoIdentidad.setNombre(tipoDocumentoIdentidadEntity.get().getNombre());
            tipoDocumentoIdentidad.setSigla(tipoDocumentoIdentidadEntity.get().getSigla());
            tipoDocumentoIdentidad.setActivo(tipoDocumentoIdentidadEntity.get().isActivo());
            return tipoDocumentoIdentidad;
        }
        return tipoDocumentoIdentidad;
    }
}
