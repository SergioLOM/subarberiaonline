package co.edu.uco.subarberiaonline.service.tipodocumentoidentidad.impl;

import co.edu.uco.subarberiaonline.converter.TipoDocumentoIdentidadConverter;
import co.edu.uco.subarberiaonline.model.TipoDocumentoIdentidad;
import co.edu.uco.subarberiaonline.repository.TipoDocumentoIdentidadRepository;
import co.edu.uco.subarberiaonline.service.tipodocumentoidentidad.TipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoDocumentoIdentidadServiceImpl implements TipoDocumentoIdentidadService {

    @Autowired
    private TipoDocumentoIdentidadRepository tipoDocumentoIdentidadRepository;

    @Autowired
    private TipoDocumentoIdentidadConverter tipoDocumentoIdentidadConverter;

    @Override
    public List<TipoDocumentoIdentidad> findAll() {
        return tipoDocumentoIdentidadConverter.entityToModel(tipoDocumentoIdentidadRepository.findAll());
    }

}
