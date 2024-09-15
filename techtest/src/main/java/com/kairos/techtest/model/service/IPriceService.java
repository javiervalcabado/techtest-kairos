package com.kairos.techtest.model.service;

import java.sql.Timestamp;
import java.util.List;

import com.kairos.techtest.model.dto.Price;

public interface IPriceService {

    Price createPrice(Price price);

    Price getPrice(Timestamp timestamp, int productID, int brandID); 

    public List<Price> getAllPrices();

    public long getPriceCount();

}
