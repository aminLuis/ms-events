package ms_filazero.ms_events.infrastructure.persistence.repository;

import ms_filazero.ms_events.infrastructure.persistence.entity.VenueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface JpaVenueRepository extends JpaRepository<VenueEntity, UUID> {
}
