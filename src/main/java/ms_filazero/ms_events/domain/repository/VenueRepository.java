package ms_filazero.ms_events.domain.repository;

import ms_filazero.ms_events.domain.model.Venue;

import java.util.Optional;
import java.util.UUID;

public interface VenueRepository {

    Venue save(Venue venue);

    Optional<Venue> findById(UUID id);

}
