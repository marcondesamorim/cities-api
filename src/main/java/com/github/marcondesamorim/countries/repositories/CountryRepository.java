package com.github.marcondesamorim.countries.repositories;

import com.github.marcondesamorim.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
