package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.RolUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RolUsuarioRepository extends JpaRepository<RolUsuarioEntity,Long> {
}
