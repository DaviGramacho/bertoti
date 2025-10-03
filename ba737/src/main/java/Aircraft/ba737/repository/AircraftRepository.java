package Aircraft.ba737.repository;

import Aircraft.ba737.model.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AircraftRepository extends JpaRepository <Aircraft, Long> {

  //  Optional<Aircraft> findByNameAircraft();

}
