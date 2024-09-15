package com.kairos.techtest.model.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class Price {

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
}
