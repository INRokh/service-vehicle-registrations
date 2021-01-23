package com.example.registrations;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "insurers", path = "insurers")
public interface InsurerRepository extends PagingAndSortingRepository<Insurer, Long> {}
