package com.kairos.techtest.model.service;

import java.sql.Timestamp;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kairos.techtest.model.entities.PriceEntity;

public interface IPriceRepository extends JpaRepository<PriceEntity, Long>{

    @Query("select p from PRICES p WHERE startDate <= ?1 AND endDate >= ?1 AND productID = ?2 AND brandID = ?3 order by priority desc limit 1")
    public PriceEntity validatePrice(Timestamp date, int productID, int brandID);
}
