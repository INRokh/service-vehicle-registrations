package com.example.registrations;

import javax.persistence.*;

@Entity
public class VehicleRegistration {
    @Id
    @GeneratedValue
    private long id;

    private String plateNumber;

    @Embedded
    private RegistrationStatus registration;

    @ManyToOne
    private Vehicle vehicle;

    @ManyToOne
    private Insurer insurer;

    public String getPlateNumber(){ return plateNumber; }
    public RegistrationStatus getRegistration() { return  registration; }
    public Vehicle getVehicle() { return vehicle; }
    public Insurer getInsurer() { return insurer; }
}
