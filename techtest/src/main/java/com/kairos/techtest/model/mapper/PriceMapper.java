package com.kairos.techtest.model.mapper;

import com.kairos.techtest.model.dto.Price;
import com.kairos.techtest.model.entities.PriceEntity;

public class PriceMapper {

    /**
     * Mapper Price Entity -> DTO
     * @param priceEntity
     * @return
     */
    public static Price mapToDTO (PriceEntity priceEntity) {

        return new Price(
            priceEntity.getBrandID(),
            priceEntity.getStartDate(),
            priceEntity.getEndDate(),
            priceEntity.getPriceList(),
            priceEntity.getProductID(),
            priceEntity.getPriority(),
            priceEntity.getPrice(),
            priceEntity.getCurrency(),
            priceEntity.getLastUpdated(),
            priceEntity.getLastUpdatedBy()
        );
    }

    /**
     * Mapper Price DTO -> Entity
     * @param priceEntity
     * @return
     */
    public static PriceEntity mapToEntity(Price price) {
        return new PriceEntity(
            price.getBrandID(),
            price.getStartDate(),
            price.getEndDate(),
            price.getPriceList(),
            price.getProductID(),
            price.getPriority(),
            price.getPrice(),
            price.getCurrency(),
            price.getLastUpdated(),
            price.getLastUpdatedBy()

        );
    }
}
