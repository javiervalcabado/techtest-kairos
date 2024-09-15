package com.kairos.techtest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;
import java.util.List;

import com.kairos.techtest.model.dto.Price;
import com.kairos.techtest.model.service.IPriceService;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class PriceController {

    private IPriceService priceService;

    @GetMapping("/count")
    public long getPriceCount() {

        long priceCount = priceService.getPriceCount();
        return priceCount;
    }

    @GetMapping("/all")
    public ResponseEntity<List<Price>> getAllPrices() {

        List<Price> priceList = priceService.getAllPrices();
        return ResponseEntity.ok(priceList);
    }

    @GetMapping("/get")
    public ResponseEntity<Price> getPrice(@PathVariable("date") Timestamp date, @PathVariable("productID") int productID, @PathVariable("brandID") int brandID) {

        
        return ResponseEntity.ok(null);
    }
}
