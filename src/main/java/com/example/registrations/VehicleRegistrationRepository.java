package com.example.registrations;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "registrations", path = "registrations", excerptProjection = RegistrationView.class)
public interface VehicleRegistrationRepository extends PagingAndSortingRepository<VehicleRegistration, Long> {}
