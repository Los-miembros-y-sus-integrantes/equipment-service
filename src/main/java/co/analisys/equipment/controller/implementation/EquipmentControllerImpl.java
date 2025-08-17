package co.analisys.equipment.controller.implementation;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import co.analisys.equipment.controller.interfaces.EquipmentController;
import co.analisys.equipment.model.Equipo;
import co.analisys.equipment.service.intefaces.EquipoService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class EquipmentControllerImpl implements EquipmentController {

    @Autowired
    private EquipoService equipoService;

    @Override
    public Equipo agregarEquipo(Equipo equipo) {
        return equipoService.agregarEquipo(equipo);
    }

    @Override
    public List<Equipo> obtenerTodosEquipos() {
        return equipoService.obtenerTodosEquipos();
    }
}
