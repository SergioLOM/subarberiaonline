package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.CitaEntity;
import co.edu.uco.subarberiaonline.model.Cita;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class CitaConverter {

    public Cita entityToModel(CitaEntity citaEntity){
        var cita = new Cita();
        cita.setId(citaEntity.getId());
        cita.setFecha(citaEntity.getFecha());
        cita.setHora(citaEntity.getHora());
        cita.setBarberia(citaEntity.getBarberia());
        cita.setUsuario(citaEntity.getUsuario());
        cita.setServicio(citaEntity.getServicio());
        return cita;
    }

    public CitaEntity modelToEntity(Cita cita){
        var citaEntity = new CitaEntity();
        citaEntity.setId(cita.getId());
        citaEntity.setFecha(cita.getFecha());
        citaEntity.setHora(cita.getHora());
        citaEntity.setBarberia(cita.getBarberia());
        citaEntity.setUsuario(cita.getUsuario());
        citaEntity.setServicio(cita.getServicio());
        return citaEntity;
    }

    public List<Cita> entityToModel(List<CitaEntity> citaEntity) {
        List<Cita> citas = new ArrayList<>(citaEntity.size());
        citaEntity.forEach(entity -> {
            citas.add(entityToModel(entity));
        });
        return citas;
    }

    public Cita entityToModel(Optional<CitaEntity> citaEntity) {
        Cita cita = null;
        if (citaEntity.isPresent()) {
            cita = new Cita();
            cita.setId(citaEntity.get().getId());
            cita.setFecha(citaEntity.get().getFecha());
            cita.setHora(citaEntity.get().getHora());
            cita.setBarberia(citaEntity.get().getBarberia());
            cita.setUsuario(citaEntity.get().getUsuario());
            cita.setServicio(citaEntity.get().getServicio());
            return cita;
        }
        return cita;
    }


}
