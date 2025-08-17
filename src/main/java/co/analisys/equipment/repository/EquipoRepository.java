package co.analisys.equipment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.analisys.equipment.model.Equipo;
import org.springframework.stereotype.Repository;


@Repository
public interface EquipoRepository extends JpaRepository<Equipo, Long> {
}
