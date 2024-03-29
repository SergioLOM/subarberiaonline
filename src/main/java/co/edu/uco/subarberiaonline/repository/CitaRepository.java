package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.BarberiaEntity;
import co.edu.uco.subarberiaonline.entity.CitaEntity;
import co.edu.uco.subarberiaonline.model.Barberia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CitaRepository extends JpaRepository<CitaEntity,Long> {

    List<CitaEntity> findAllByBarberia(Barberia id);

}
