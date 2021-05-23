package com.github.marcondesamorim.states.repositories;

import com.github.marcondesamorim.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}

