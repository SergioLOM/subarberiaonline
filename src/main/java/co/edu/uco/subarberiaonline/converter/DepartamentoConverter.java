package co.edu.uco.subarberiaonline.converter;

import co.edu.uco.subarberiaonline.entity.DepartamentoEntity;
import co.edu.uco.subarberiaonline.model.Departamento;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class DepartamentoConverter {

    public Departamento entityToModel(DepartamentoEntity departamentoEntity){
        var departamento = new Departamento();
        departamento.setId(departamentoEntity.getId());
        departamento.setNombre(departamentoEntity.getNombre());
        return departamento;
    }

    public DepartamentoEntity modelToEntity(Departamento departamento){
        var departamentoEntity = new DepartamentoEntity();
        departamentoEntity.setId(departamento.getId());
        departamentoEntity.setNombre(departamento.getNombre());
        return departamentoEntity;
    }

    public Departamento entityToModel(Optional<DepartamentoEntity> departamentoEntity) {
        Departamento departamento = null;
        if (departamentoEntity.isPresent()) {
            departamento = new Departamento();
            departamento.setId(departamentoEntity.get().getId());
            departamento.setNombre(departamentoEntity.get().getNombre());
            return departamento;
        }
        return departamento;
    }
}
