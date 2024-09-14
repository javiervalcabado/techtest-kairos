package com.kairos.techtest.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "PRICES")
@Getter
@Setter
public class Price implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
/*
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private static final long serialVersionUID = 1L;
*/
    // TODO: FIX and use id <- object
    private int brandID;

    private Timestamp startDate;

    private Timestamp endDate;

    private int priceList;

    private int productID;

    private int priority;

    private double price;

    private String currency;

    private Timestamp lastUpdated;

    // TODO: FIX and use id <- object
    private String lastUpdatedBy;
}
