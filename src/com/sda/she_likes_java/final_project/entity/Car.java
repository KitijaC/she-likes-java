package com.sda.she_likes_java.final_project.entity;

import java.time.YearMonth;

// TODO: add fields
public record Car(
        Long id,
        String brand,
        String model,
        GearboxType gearboxType,
        CarBody carBody,
        PriceCategory category,
        FuelType fuelType,
        long mileage,
        YearMonth productionDate) {
}
