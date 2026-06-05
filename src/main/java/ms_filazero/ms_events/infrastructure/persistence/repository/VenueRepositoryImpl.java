package ms_filazero.ms_events.infrastructure.persistence.repository;

import ms_filazero.ms_events.domain.model.Venue;
import ms_filazero.ms_events.domain.repository.VenueRepository;
import ms_filazero.ms_events.mapper.VenuePersistenceMapper;
import org.springframework.stereotype.Component;

import java.util.Optional;
import java.util.UUID;

@Component
public class VenueRepositoryImpl implements VenueRepository {

    private final JpaVenueRepository jpaRepository;

    public VenueRepositoryImpl(
            JpaVenueRepository jpaRepository) {

        this.jpaRepository = jpaRepository;
    }

    @Override
    public Venue save(Venue venue) {
        return VenuePersistenceMapper.toDomain(
                jpaRepository.save(
                        VenuePersistenceMapper.toEntity(venue)
                )
        );
    }

    @Override
    public Optional<Venue> findById(UUID id) {
        return jpaRepository.findById(id)
                .map(VenuePersistenceMapper::toDomain);
    }
}
