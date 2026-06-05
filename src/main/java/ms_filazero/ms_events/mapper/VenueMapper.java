package ms_filazero.ms_events.mapper;

import ms_filazero.ms_events.domain.model.Venue;
import ms_filazero.ms_events.dto.CreateVenueRequest;
import ms_filazero.ms_events.dto.VenueResponse;

import java.time.LocalDateTime;
import java.util.UUID;

public class VenueMapper {

    public static Venue toDomain(CreateVenueRequest request) {

        return new Venue(
                UUID.randomUUID(),
                request.getName(),
                request.getCity(),
                request.getCountry(),
                request.getAddress(),
                request.getCapacity(),
                LocalDateTime.now()
        );
    }

    public static VenueResponse toResponse(Venue venue) {

        VenueResponse response = new VenueResponse();

        response.setId(venue.getId());
        response.setName(venue.getName());
        response.setCity(venue.getCity());
        response.setCountry(venue.getCountry());
        response.setAddress(venue.getAddress());
        response.setCapacity(venue.getCapacity());

        return response;
    }

}
