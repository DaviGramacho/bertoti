package Aircraft.ba737.controller;

import Aircraft.ba737.model.Pilot;
import Aircraft.ba737.services.PilotServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/pilot")
@Tag(name = "pilot")
public class PilotController {

    private final PilotServices pilotServices;

    public PilotController(PilotServices pilotServices) {
        this.pilotServices = pilotServices;
    }

    @PostMapping
    @Operation(summary = "Cria um piloto", description = "Cadastra um novo piloto")
    @ApiResponses(value = { @ApiResponse(responseCode = "201"), @ApiResponse(responseCode = "400") })
    public ResponseEntity<Pilot> cadastrarPilot(@RequestBody Pilot request) {
        Pilot salvarPilot = pilotServices.cadastrarPilot(request);
        return ResponseEntity.status(201).body(salvarPilot);
    }

    @GetMapping
    @Operation(summary = "Lista todos os pilotos", description = "Busca todos os pilotos cadastrados")
    @ApiResponses(value = { @ApiResponse(responseCode = "200") })
    public ResponseEntity<List<Pilot>> buscarPilots() {
        return ResponseEntity.ok(pilotServices.buscarPilots());
    }

    @GetMapping("/{id}")
    @Operation(summary = "Busca piloto por ID", description = "Busca um piloto específico pelo seu ID")
    @ApiResponses(value = { @ApiResponse(responseCode = "200"), @ApiResponse(responseCode = "404") })
    public ResponseEntity<Pilot> buscarPilotId(@PathVariable Long id) {
        Optional<Pilot> pilot = pilotServices.buscarPilotId(id);
        return pilot.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    @Operation(summary = "Atualiza um piloto", description = "Atualiza as informações de um piloto existente")
    @ApiResponses(value = { @ApiResponse(responseCode = "200"), @ApiResponse(responseCode = "404") })
    public ResponseEntity<Pilot> atualizarPilot(@PathVariable Long id, @RequestBody Pilot pilotAtualizado) {
        try {
            Pilot atualizado = pilotServices.atualizarPilot(id, pilotAtualizado);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    @Operation(summary = "Deleta um piloto", description = "Exclui um piloto do sistema")
    @ApiResponses(value = { @ApiResponse(responseCode = "200"), @ApiResponse(responseCode = "404") })
    public ResponseEntity<Void> deletarPilot(@PathVariable Long id) {
        Optional<Pilot> pilot = pilotServices.buscarPilotId(id);
        if (pilot.isPresent()) {
            pilotServices.deletarPilot(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
