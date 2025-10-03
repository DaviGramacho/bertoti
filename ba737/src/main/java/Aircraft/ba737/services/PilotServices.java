package Aircraft.ba737.services;

import Aircraft.ba737.model.Pilot;
import Aircraft.ba737.repository.PilotRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PilotServices {

    private final PilotRepository pilotRepository;

    public PilotServices(PilotRepository pilotRepository) {
        this.pilotRepository = pilotRepository;
    }

    public Pilot cadastrarPilot(Pilot pilot) {
        return pilotRepository.save(pilot);
    }

    public List<Pilot> buscarPilots() {
        return pilotRepository.findAll();
    }

    public Optional<Pilot> buscarPilotId(Long id) {
        return pilotRepository.findById(id);
    }

    public Pilot atualizarPilot(Long id, Pilot pilotAtualizado) {
        return pilotRepository.findById(id).map(p -> {
            p.setNome(pilotAtualizado.getNome());
            p.setLicenca(pilotAtualizado.getLicenca());
            p.setHorasVoo(pilotAtualizado.getHorasVoo());
            return pilotRepository.save(p);
        }).orElseThrow(() -> new RuntimeException("Piloto não encontrado com id: " + id));
    }

    public void deletarPilot(Long id) {
        pilotRepository.deleteById(id);
    }
}
