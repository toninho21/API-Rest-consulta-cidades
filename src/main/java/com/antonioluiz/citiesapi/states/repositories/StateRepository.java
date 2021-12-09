package com.antonioluiz.citiesapi.states.repositories;


import com.antonioluiz.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}