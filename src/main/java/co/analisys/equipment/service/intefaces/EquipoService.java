package co.analisys.equipment.service.intefaces;

import java.util.List;

import co.analisys.equipment.model.Equipo;
import org.springframework.stereotype.Service;

public interface EquipoService {

    Equipo agregarEquipo(Equipo equipo);

    List<Equipo> obtenerTodosEquipos();

} 
