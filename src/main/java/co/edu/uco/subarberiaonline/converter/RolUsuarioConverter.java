package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.RolUsuarioEntity;
import co.edu.uco.subarberiaonline.model.RolUsuario;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class RolUsuarioConverter {

    public RolUsuario entityToModel(RolUsuarioEntity rolUsuarioEntity){
        var rolUsuario = new RolUsuario();
        rolUsuario.setId(rolUsuarioEntity.getId());
        rolUsuario.setNombre(rolUsuarioEntity.getNombre());
        return rolUsuario;
    }

    public RolUsuarioEntity modelToEntity(RolUsuario rolUsuario){
        var rolUsuarioEntity = new RolUsuarioEntity();
        rolUsuarioEntity.setId(rolUsuario.getId());
        rolUsuarioEntity.setNombre(rolUsuario.getNombre());
        return rolUsuarioEntity;
    }

    public RolUsuario entityToModel(Optional<RolUsuarioEntity> rolUsuarioEntity) {
        RolUsuario rolUsuario = null;
        if (rolUsuarioEntity.isPresent()) {
            rolUsuario = new RolUsuario();
            rolUsuario.setId(rolUsuarioEntity.get().getId());
            rolUsuario.setNombre(rolUsuarioEntity.get().getNombre());
            return rolUsuario;
        }
        return rolUsuario;
    }
}
