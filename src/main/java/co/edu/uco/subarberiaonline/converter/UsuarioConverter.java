package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.UsuarioEntity;
import co.edu.uco.subarberiaonline.model.Usuario;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class UsuarioConverter {

    public Usuario entityToModel(UsuarioEntity usuarioEntity){
        var usuario = new Usuario();
        usuario.setId(usuarioEntity.getId());
        usuario.setNombre(usuarioEntity.getNombre());
        usuario.setApellido(usuarioEntity.getApellido());
        usuario.setNroDocumento(usuarioEntity.getNroDocumento());
        usuario.setTipoDocumentoIdentidad(usuarioEntity.getTipoDocumentoIdentidad());
        return usuario;
    }

    public UsuarioEntity modelToEntity(Usuario usuario){
        var usuarioEntity = new UsuarioEntity();
        usuarioEntity.setId(usuario.getId());
        usuarioEntity.setNombre(usuario.getNombre());
        usuarioEntity.setApellido(usuario.getApellido());
        usuarioEntity.setNroDocumento(usuario.getNroDocumento());
        usuarioEntity.setTipoDocumentoIdentidad(usuario.getTipoDocumentoIdentidad());
        return usuarioEntity;
    }

    public List<Usuario> entityToModel(List<UsuarioEntity> usuarioEntity) {
        List<Usuario> usuarios = new ArrayList<>(usuarioEntity.size());
        usuarioEntity.forEach(entity -> {
            usuarios.add(entityToModel(entity));
        });
        return usuarios;
    }

    public Usuario entityToModel(Optional<UsuarioEntity> usuarioEntity) {
        Usuario usuario = null;
        if (usuarioEntity.isPresent()) {
            usuario = new Usuario();
            usuario.setId(usuarioEntity.get().getId());
            usuario.setNombre(usuarioEntity.get().getNombre());
            usuario.setApellido(usuarioEntity.get().getApellido());
            usuario.setNroDocumento(usuarioEntity.get().getNroDocumento());
            usuario.setTipoDocumentoIdentidad(usuarioEntity.get().getTipoDocumentoIdentidad());
            return usuario;
        }
        return usuario;
    }




}
