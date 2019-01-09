package com.hibicode.bearstore.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hibicode.bearstore.model.Beer;
import com.hibicode.bearstore.model.BeerType;

public interface Beers extends JpaRepository<Beer, Long> {

    Optional<Beer> findByNameAndType(String name, BeerType type);

}
