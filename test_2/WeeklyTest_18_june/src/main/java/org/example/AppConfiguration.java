package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.example")
public class AppConfiguration {

    @Bean
    public Car car(){
        return new Car();
    }

    @Bean
    public FuelInjector fuelInjector() {
        return new FuelInjector();
    }

    @Bean
    public Engine engine(){
        return new Engine(fuelInjector());
    }


}
