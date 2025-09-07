package co.analisys.equipment.service.intefaces;

import java.util.List;

import co.analisys.equipment.model.Equipo;

public interface EquipoService {

    Equipo agregarEquipo(Equipo equipo);

    List<Equipo> obtenerTodosEquipos();

} 
