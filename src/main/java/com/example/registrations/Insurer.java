package com.example.registrations;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Insurer {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private long code;

    public String getName() { return name; }
    public long getCode() { return code; }
}
