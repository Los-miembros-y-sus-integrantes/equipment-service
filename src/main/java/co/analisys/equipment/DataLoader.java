package co.analisys.equipment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import co.analisys.equipment.model.*;
import co.analisys.equipment.repository.EquipoRepository;

@Component
public class DataLoader implements CommandLineRunner {

    @Autowired
    private EquipoRepository equipoRepository;

    @Override
    public void run(String... args) throws Exception {
        Equipo equipo1 = new Equipo();
        equipo1.setNombre("Mancuernas");
        equipo1.setDescripcion("Set de mancuernas de 5kg");
        equipo1.setCantidad(20);
        equipoRepository.save(equipo1);

        Equipo equipo2 = new Equipo();
        equipo2.setNombre("Bicicleta estática");
        equipo2.setDescripcion("Bicicleta para spinning");
        equipo2.setCantidad(15);
        equipoRepository.save(equipo2);
        System.out.println("Datos de préstamos de ejemplo cargados exitosamente.");
    }
}