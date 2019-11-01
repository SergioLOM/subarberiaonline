package co.edu.uco.subarberiaonline.service.cita.impl;

import co.edu.uco.subarberiaonline.converter.BaberiaConverter;
import co.edu.uco.subarberiaonline.converter.CitaConverter;
import co.edu.uco.subarberiaonline.converter.UsuarioConverter;
import co.edu.uco.subarberiaonline.entity.CitaEntity;
import co.edu.uco.subarberiaonline.entity.UsuarioEntity;
import co.edu.uco.subarberiaonline.model.Barberia;
import co.edu.uco.subarberiaonline.model.Cita;
import co.edu.uco.subarberiaonline.repository.BarberiaRepository;
import co.edu.uco.subarberiaonline.repository.CitaRepository;
import co.edu.uco.subarberiaonline.repository.UsuarioRepository;
import co.edu.uco.subarberiaonline.service.cita.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaRepository citaRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private BarberiaRepository barberiaRepository;

    @Autowired
    private CitaConverter citaConverter;
    @Autowired
    private UsuarioConverter usuarioConverter;
    @Autowired
    private BaberiaConverter baberiaConverter;


    @Override
    public Cita findById(Long id) {
        return citaConverter.entityToModel(citaRepository.findById(id));
    }

    @Override
    public List<Cita> findAll() {
        return citaConverter.entityToModel(citaRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        citaRepository.deleteById(id);
    }

    @Override
    public void save(Cita cita) {
        citaRepository.save(citaConverter.modelToEntity(cita));
    }

    @Override
    public List<Cita> findAllByBarberia(Barberia id){ return citaConverter.entityToModel(citaRepository.findAllByBarberia(id));}

}
