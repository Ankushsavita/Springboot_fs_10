package org.example;

import org.springframework.stereotype.Component;

@Component
public class FuelInjector {
    private String brand;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
