package com.github.marcondesamorim.cities.resources;

import com.github.marcondesamorim.cities.entities.City;
import com.github.marcondesamorim.cities.repositories.CityRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cities")
public class CityResource {

    private  CityRepository repository;

    public CityResource(CityRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public Page<City> cities(Pageable page) {
        return repository.findAll(page);
    }
}