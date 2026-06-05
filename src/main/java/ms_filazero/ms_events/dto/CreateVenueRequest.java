package ms_filazero.ms_events.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateVenueRequest {

    @NotBlank
    private String name;

    @NotBlank
    private String city;

    @NotBlank
    private String country;

    @NotBlank
    private String address;

    @NotBlank
    private Long capacity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }
}
