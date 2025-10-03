
package Aircraft.ba737.controller;

import Aircraft.ba737.model.Aircraft;
import Aircraft.ba737.services.AircraftServices;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/aircraft")
@Tag(name = "aircraft")
public class AircraftController {
    private final AircraftServices aircraftServices;


    public AircraftController(AircraftServices aircraftServices) {
        this.aircraftServices = aircraftServices;
    }

    @PostMapping
    @Operation(summary = "Cria um avião",
            description = "Cria um avião")
    @ApiResponses(value = {@ApiResponse(responseCode = "201"), @ApiResponse(responseCode = "400")})
    public ResponseEntity<Aircraft> cadastrarAircraft(@RequestBody Aircraft request) {
        Aircraft aircraft = new Aircraft();

        aircraft.setDescricao(request.getDescricao());
        aircraft.setDataAutoAvaliacao(request.getDataAutoAvaliacao());

        Aircraft salvarAircraft = aircraftServices.cadastrarAircraft(aircraft);
        return ResponseEntity.status(201).body(salvarAircraft);

    }

    @GetMapping
    @Operation(summary = "Realiza a busca do avião",
            description = "Ferramenta que permite buscar todas as autoavaliações.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200")})
    public ResponseEntity<List<Aircraft>> buscarAircraft() {
        return ResponseEntity.ok(aircraftServices.buscarAircraft());

    }

    @GetMapping("/{id}")
    @Operation(summary = "Realiza a busca da autoavaliação pelo ID",
            description = "Busca  autoavaliação pelo ID.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200"), @ApiResponse(responseCode = "404")})
    public ResponseEntity<Aircraft> buscarIdAircraft(@PathVariable Long id) {
        Optional<Aircraft> aircraft = aircraftServices.buscarAutoAvaliacaoId(id);
        if (aircraft.isPresent())
            return ResponseEntity.ok(aircraft.get());
        else
            return ResponseEntity.notFound().build();
    }

    @DeleteMapping
    @Operation(summary = "Realiza a exclusão da autoavaliação",
            description = "Ferramenta que permite excluir uma das autoavaliações.")
    @ApiResponses(value = {@ApiResponse(responseCode = "200"),@ApiResponse(responseCode = "404")})
    public ResponseEntity deletarAutoAvaliacao(Long id) {
        Optional<Aircraft> autoAvaliacao = aircraftServices.buscarAutoAvaliacaoId(id);
        if (autoAvaliacao.isPresent()){
            aircraftServices.deletarAutoAvaliacao(id);
            return ResponseEntity.ok().build();
        }else{
            return ResponseEntity.notFound().build();
        }

    }

}
