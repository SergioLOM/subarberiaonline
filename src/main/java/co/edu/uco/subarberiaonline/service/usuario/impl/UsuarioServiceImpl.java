package co.edu.uco.subarberiaonline.service.usuario.impl;

import co.edu.uco.subarberiaonline.converter.UsuarioConverter;
import co.edu.uco.subarberiaonline.model.Usuario;
import co.edu.uco.subarberiaonline.repository.UsuarioRepository;
import co.edu.uco.subarberiaonline.service.usuario.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Autowired
    private UsuarioConverter converter;


    @Override
    public Usuario findById(Long id) {
        return converter.entityToModel(usuarioRepository.findById(id));
    }

    @Override
    public Usuario findByNroDocumento(String nroDocumento) {
        return converter.entityToModel(usuarioRepository.findByNroDocumento(nroDocumento));
    }

    @Override
    public List<Usuario> findAll() {
        return converter.entityToModel(usuarioRepository.findAll());
    }

    @Override
    public void deleteById(Long id) {
        usuarioRepository.deleteById(id);
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(converter.modelToEntity(usuario));
    }

}
