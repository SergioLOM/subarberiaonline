package co.edu.uco.subarberiaonline.controller;

import co.edu.uco.subarberiaonline.model.TipoDocumentoIdentidad;
import co.edu.uco.subarberiaonline.service.tipodocumentoidentidad.TipoDocumentoIdentidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/tipodocumentoidentidad")
public class TipoDocumentoIdentidadController {

    @Autowired
    private TipoDocumentoIdentidadService tipoDocumentoIdentidadService;

    @GetMapping("/tipodociden")
    public List<TipoDocumentoIdentidad> findAll(){ return tipoDocumentoIdentidadService.findAll(); }

}
