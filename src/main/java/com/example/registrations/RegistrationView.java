package com.example.registrations;


import org.springframework.data.rest.core.config.Projection;


@Projection(name = "unnested", types = { VehicleRegistration.class })
public interface RegistrationView {

    String getPlateNumber();
    RegistrationStatus getRegistration();
    Vehicle getVehicle();
    Insurer getInsurer();
}
