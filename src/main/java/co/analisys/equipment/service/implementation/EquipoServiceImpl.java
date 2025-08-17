package co.analisys.equipment.service.implementation;

import java.util.List;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import co.analisys.equipment.model.Equipo;
import co.analisys.equipment.repository.EquipoRepository;
import co.analisys.equipment.service.intefaces.EquipoService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EquipoServiceImpl implements EquipoService {

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public Equipo agregarEquipo(Equipo equipo) {
        return equipoRepository.save(equipo);
    }

    @Override
    public List<Equipo> obtenerTodosEquipos() {
        return equipoRepository.findAll();
    }
}
