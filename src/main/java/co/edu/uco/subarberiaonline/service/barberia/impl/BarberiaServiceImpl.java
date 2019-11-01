package co.edu.uco.subarberiaonline.service.barberia.impl;

import co.edu.uco.subarberiaonline.converter.BaberiaConverter;
import co.edu.uco.subarberiaonline.model.Barberia;
import co.edu.uco.subarberiaonline.repository.BarberiaRepository;
import co.edu.uco.subarberiaonline.service.barberia.BabeberiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarberiaServiceImpl implements BabeberiaService {

    @Autowired
    private BarberiaRepository barberiaRepository;

    @Autowired
    private BaberiaConverter converter;


    @Override
    public Barberia findById(Long id) { return converter.entityToModel(barberiaRepository.findById(id)); }

    @Override
    public Barberia findByNit(String nit) {
        return converter.entityToModel(barberiaRepository.findByNit(nit));
    }

    @Override
    public List<Barberia> findAll() {
        return converter.entityToModel(barberiaRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        barberiaRepository.deleteById(id);
    }

    @Override
    public void save(Barberia barberia) {
        barberiaRepository.save(converter.modelToEntity(barberia));
    }

}
