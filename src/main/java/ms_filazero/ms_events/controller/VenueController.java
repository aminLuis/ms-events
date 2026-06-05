package ms_filazero.ms_events.controller;

import jakarta.validation.Valid;
import ms_filazero.ms_events.dto.CreateVenueRequest;
import ms_filazero.ms_events.dto.VenueResponse;
import ms_filazero.ms_events.mapper.VenueMapper;
import ms_filazero.ms_events.service.VenueService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/venues")
public class VenueController {

    private final VenueService venueService;

    public VenueController(VenueService venueService) {
        this.venueService = venueService;
    }

    @PostMapping
    public VenueResponse create(@Valid @RequestBody CreateVenueRequest request) {
        return VenueMapper.toResponse(
                venueService.createVenue(request)
        );
    }

}
