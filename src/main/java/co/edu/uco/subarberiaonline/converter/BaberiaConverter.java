package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.BarberiaEntity;
import co.edu.uco.subarberiaonline.model.Barberia;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class BaberiaConverter {

    public Barberia entityToModel(BarberiaEntity barberiaEntity){
        var barberia = new Barberia();
        barberia.setId(barberiaEntity.getId());
        barberia.setNombre(barberiaEntity.getNombre());
        barberia.setNit(barberiaEntity.getNit());
        return barberia;
    }

    public BarberiaEntity modelToEntity(Barberia barberia){
        var barberiaEntity = new BarberiaEntity();
        barberiaEntity.setId(barberia.getId());
        barberiaEntity.setNombre(barberia.getNombre());
        barberiaEntity.setNit(barberia.getNit());
        return barberiaEntity;
    }

    public List<Barberia> entityToModel(List<BarberiaEntity> barberiaEntity) {
        List<Barberia> barberias = new ArrayList<>(barberiaEntity.size());
        barberiaEntity.forEach(entity -> {
            barberias.add(entityToModel(entity));
        });
        return barberias;
    }

    public Barberia entityToModel(Optional<BarberiaEntity> barberiaEntity) {
        Barberia barberia = null;
        if (barberiaEntity.isPresent()) {
            barberia = new Barberia();
            barberia.setId(barberiaEntity.get().getId());
            barberia.setNombre(barberiaEntity.get().getNombre());
            barberia.setNit(barberiaEntity.get().getNit());
            return barberia;
        }
        return barberia;
    }

}
