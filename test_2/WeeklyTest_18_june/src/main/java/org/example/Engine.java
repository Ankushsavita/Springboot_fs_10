package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Engine {
    private String type;

    @Autowired
    private FuelInjector fuelInjector;

    public Engine(FuelInjector fuelInjector) {
        this.fuelInjector = fuelInjector;
    }

    public Engine() {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
