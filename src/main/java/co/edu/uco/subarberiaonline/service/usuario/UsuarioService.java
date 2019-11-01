package co.edu.uco.subarberiaonline.service.usuario;

import co.edu.uco.subarberiaonline.model.Usuario;

import java.util.List;

public interface UsuarioService {

    Usuario findById(Long id);

    Usuario findByNroDocumento(String nroDocumento);

    List<Usuario> findAll();

    void deleteById(Long id);

    void save(Usuario usuarioEntity);

}
