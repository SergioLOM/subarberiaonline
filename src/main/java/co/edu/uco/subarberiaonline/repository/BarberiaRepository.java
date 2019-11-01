package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.BarberiaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BarberiaRepository extends JpaRepository<BarberiaEntity,Long> {

    BarberiaEntity findByNit(String nit);

}
