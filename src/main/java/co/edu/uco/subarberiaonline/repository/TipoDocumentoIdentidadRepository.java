package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.TipoDocumentoIdentidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDocumentoIdentidadRepository extends JpaRepository<TipoDocumentoIdentidadEntity,Long> {
}
