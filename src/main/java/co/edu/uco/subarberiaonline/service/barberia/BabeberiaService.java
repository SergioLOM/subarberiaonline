package co.edu.uco.subarberiaonline.service.barberia;

import co.edu.uco.subarberiaonline.model.Barberia;

import java.util.List;

public interface BabeberiaService {

    Barberia findById(Long id);

    Barberia findByNit(String nit);

    List<Barberia> findAll();

    void deleteById(Long id);

    void save(Barberia barberiaEntity);

}
