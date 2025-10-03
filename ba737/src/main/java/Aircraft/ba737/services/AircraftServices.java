
package Aircraft.ba737.services;

import Aircraft.ba737.model.Aircraft;
import Aircraft.ba737.repository.AircraftRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AircraftServices {
    private final AircraftRepository aircraftRepository;

    public AircraftServices(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    public Aircraft cadastrarAircraft(Aircraft aircraft) {
        return aircraftRepository.save(aircraft);
    }

    public List<Aircraft> buscarAircraft() {
        return aircraftRepository.findAll();
    }

    public void deletarAutoAvaliacao(Long id) {
        aircraftRepository.deleteById(id);
    }

    public Optional<Aircraft> buscarAutoAvaliacaoId(Long id) {
        return aircraftRepository.findById(id);
    }


}