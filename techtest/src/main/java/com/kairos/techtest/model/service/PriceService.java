package com.kairos.techtest.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kairos.techtest.model.entities.Price;

@Service
public class PriceService implements IPriceService{

    @Autowired
    private IPriceDAO priceDAO;

    @Override
    public List<Price> getPrices() {
        // TODO Auto-generated method stub
        return (List<Price>) priceDAO.findAll();
    }

    
}
