package ms_filazero.ms_events.mapper;

import ms_filazero.ms_events.domain.model.Venue;
import ms_filazero.ms_events.infrastructure.persistence.entity.VenueEntity;

public class VenuePersistenceMapper {

    public static Venue toDomain(VenueEntity entity) {
        if (entity == null) {
            return null;
        }
        return new Venue(
                entity.getId(),
                entity.getName(),
                entity.getCity(),
                entity.getCountry(),
                entity.getAddress(),
                entity.getCapacity(),
                entity.getCreatedAt()
        );
    }

    public static VenueEntity toEntity(Venue venue) {
        if (venue == null) {
            return null;
        }
        VenueEntity entity = new VenueEntity();
        entity.setId(venue.getId());
        entity.setName(venue.getName());
        entity.setCity(venue.getCity());
        entity.setCountry(venue.getCountry());
        entity.setAddress(venue.getAddress());
        entity.setCapacity(venue.getCapacity());
        entity.setCreatedAt(venue.getCreatedAt());

        return entity;
    }

}
