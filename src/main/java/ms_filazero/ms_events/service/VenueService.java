package ms_filazero.ms_events.service;

import ms_filazero.ms_events.domain.model.Venue;
import ms_filazero.ms_events.domain.repository.VenueRepository;
import ms_filazero.ms_events.dto.CreateVenueRequest;
import ms_filazero.ms_events.mapper.VenueMapper;
import org.springframework.stereotype.Service;

@Service
public class VenueService {

    private final VenueRepository venueRepository;

    public VenueService(VenueRepository venueRepository) {
        this.venueRepository = venueRepository;
    }

    public Venue createVenue(CreateVenueRequest request) {
        Venue venue = VenueMapper.toDomain(request);
        return venueRepository.save(venue);
    }
}
