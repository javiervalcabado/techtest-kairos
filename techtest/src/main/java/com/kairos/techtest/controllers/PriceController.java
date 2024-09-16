package com.kairos.techtest.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
    public ResponseEntity<Price> getPrice(@RequestParam(required = false) String date, @RequestParam(required = false) int productID, @RequestParam(required = false) Integer brandID) {

        Price price = priceService.getPrice(date, productID, brandID);
        return ResponseEntity.ok(price);
    }
}
