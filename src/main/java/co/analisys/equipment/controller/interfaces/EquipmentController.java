package co.analisys.equipment.controller.interfaces;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import co.analisys.equipment.model.Equipo;



@RequestMapping("/api/equipos")
@Tag(name = "Equipo", description = "Operaciones relacionadas con los equipos")
public interface EquipmentController {

    @PostMapping()
    @Operation(summary = "Agregar un nuevo equipo")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "201", description = "Equipo agregado exitosamente"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "400", description = "Solicitud inválida")
    })
    Equipo agregarEquipo(@RequestBody Equipo equipo);

    @GetMapping()
    @Operation(summary = "Obtener todos los equipos")
    @ApiResponses(value = {
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "200", description = "Equipos obtenidos exitosamente"),
            @io.swagger.v3.oas.annotations.responses.ApiResponse(responseCode = "404", description = "No se encontraron equipos")
    })
    List<Equipo> obtenerTodosEquipos();
}
