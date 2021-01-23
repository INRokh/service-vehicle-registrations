package com.example.registrations;

import javax.persistence.Embeddable;
import java.time.LocalDateTime;

@Embeddable
public class RegistrationStatus {

    private boolean expired;
    private LocalDateTime expiryDate;

    public boolean getExpired() { return expired; }
    public LocalDateTime getExpiryDate() { return expiryDate; }
}
