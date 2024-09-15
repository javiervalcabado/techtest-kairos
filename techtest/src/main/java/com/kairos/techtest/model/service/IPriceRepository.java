package com.kairos.techtest.model.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kairos.techtest.model.entities.PriceEntity;

public interface IPriceRepository extends JpaRepository<PriceEntity, Long>{

}
