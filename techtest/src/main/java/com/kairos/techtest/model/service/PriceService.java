package com.kairos.techtest.model.service;

import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kairos.techtest.model.dto.Price;
import com.kairos.techtest.model.entities.PriceEntity;
import com.kairos.techtest.model.mapper.PriceMapper;

import lombok.AllArgsConstructor;


@Service
@AllArgsConstructor
public class PriceService implements IPriceService{

    @Autowired
    private IPriceRepository priceRepository;

    @Override
    public Price createPrice(Price price) {

        PriceEntity priceEntity = PriceMapper.mapToEntity(price);
        priceRepository.save(priceEntity);
        return price;
    }

    @Override
    public Price getPrice(Timestamp timestamp, int productID, int brandID) {
        
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPrice'");
    }

    @Override
    public List<Price> getAllPrices() {

        List<PriceEntity> priceList = priceRepository.findAll();
        return priceList.stream().map((priceEntity) -> PriceMapper.mapToDTO(priceEntity)).collect(Collectors.toList());
    }

    @Override
    public long getPriceCount() {
        
        return priceRepository.count();
    }

}
