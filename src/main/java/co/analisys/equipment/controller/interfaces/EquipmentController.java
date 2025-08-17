package co.analisys.equipment.controller.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.analisys.equipment.model.Equipo;



@RequestMapping("/api/equipos")
public interface EquipmentController {

    @PostMapping()
    Equipo agregarEquipo(@RequestBody Equipo equipo);

    @GetMapping()
    List<Equipo> obtenerTodosEquipos(); 
}
