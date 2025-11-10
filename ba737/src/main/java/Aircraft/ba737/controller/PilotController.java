package Aircraft.ba737.controller;

import Aircraft.ba737.model.Pilot;
import Aircraft.ba737.services.PilotServices;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*") // permitir chamadas do front em outra porta
@RestController
@RequestMapping("/pilot")
public class PilotController {

    private final PilotServices pilotServices;

    public PilotController(PilotServices pilotServices) {
        this.pilotServices = pilotServices;
    }

    @PostMapping
    public ResponseEntity<Pilot> cadastrarPilot(@RequestBody Pilot request) {
        Pilot salvarPilot = pilotServices.cadastrarPilot(request);
        return ResponseEntity.status(201).body(salvarPilot);
    }

    @GetMapping
    public ResponseEntity<List<Pilot>> buscarPilots() {
        return ResponseEntity.ok(pilotServices.buscarPilots());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pilot> buscarPilotId(@PathVariable Long id) {
        Optional<Pilot> pilot = pilotServices.buscarPilotId(id);
        return pilot.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pilot> atualizarPilot(@PathVariable Long id, @RequestBody Pilot pilotAtualizado) {
        try {
            Pilot atualizado = pilotServices.atualizarPilot(id, pilotAtualizado);
            return ResponseEntity.ok(atualizado);
        } catch (RuntimeException e) {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
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
