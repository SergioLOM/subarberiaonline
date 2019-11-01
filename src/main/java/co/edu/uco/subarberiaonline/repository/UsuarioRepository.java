package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository  extends JpaRepository<UsuarioEntity,Long> {

    UsuarioEntity findByNroDocumento(String nroDocumento);

}
