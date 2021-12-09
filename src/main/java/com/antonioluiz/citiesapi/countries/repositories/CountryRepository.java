package com.antonioluiz.citiesapi.countries.repositories;


import com.antonioluiz.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}