package com.example.registrations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Vehicle {
    @Id
    @GeneratedValue
    private long id;

    private String type;
    private String make;
    private String model;
    private String colour;
    private String vin;
    private Integer tareWeight;
    private Integer grossMass;

    public String getType() { return type; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColour() { return colour; }
    public String getVin() { return vin; }
    public Integer getTareWeight() { return tareWeight; }
    public Integer getGrossMass() { return grossMass; }
}
