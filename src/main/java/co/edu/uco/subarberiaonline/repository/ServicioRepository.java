package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.ServicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<ServicioEntity,Long> {
}
