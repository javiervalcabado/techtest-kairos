package com.kairos.techtest.model.entities;

import java.io.Serializable;
import java.sql.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity(name = "PRICES")
@Table(name = "PRICES")
@Getter
@Setter
@NoArgsConstructor

public class PriceEntity implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

    private int brandID;

    private Timestamp startDate;

    private Timestamp endDate;

    private int priceList;

    private int productID;

    private int priority;

    private double price;

    private String currency;

    private Timestamp lastUpdated;

    private String lastUpdatedBy;

    
    public PriceEntity(int brand, Timestamp startDate2, Timestamp endDate2, int priceList2, int productID2,
            int priority2, double price2, String currency2, Timestamp lastUpdated2, String lastUpdatedBy2) {        
    }
}
