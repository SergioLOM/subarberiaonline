package co.edu.uco.subarberiaonline.service.cita;

import co.edu.uco.subarberiaonline.model.Barberia;
import co.edu.uco.subarberiaonline.model.Cita;

import java.util.List;

public interface CitaService {

    Cita findById(Long id);

    List<Cita> findAll();

    void deleteById(Long id);

    void save(Cita citaEntity);

    List<Cita> findAllByBarberia(Barberia id);

}
