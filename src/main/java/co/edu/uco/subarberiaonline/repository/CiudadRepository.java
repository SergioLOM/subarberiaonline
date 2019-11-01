package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.CiudadEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends JpaRepository<CiudadEntity,Long> {

}
