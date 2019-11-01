package co.edu.uco.subarberiaonline.repository;

import co.edu.uco.subarberiaonline.entity.DepartamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartamentoRepository extends JpaRepository<DepartamentoEntity,Long> {
}
