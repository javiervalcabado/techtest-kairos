package com.kairos.techtest.model.service;

import org.springframework.data.repository.CrudRepository;

import com.kairos.techtest.model.entities.Price;

public interface IPriceDAO extends CrudRepository<Price, Long>{

}
