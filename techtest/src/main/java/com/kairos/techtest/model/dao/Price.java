package com.kairos.techtest.model.dao;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Price {

    private Brand brand;

    private Date startDate;

    private Date endDate;

    private int priceList;

    private int productID;

    private int priority;

    private double price;

    private Currency currency;

    private Date lastUpdated;

    private User lastUpdatedBy;
}
