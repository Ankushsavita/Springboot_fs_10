package com.geekster.RestaurantApp.service;

import com.geekster.RestaurantApp.model.Restaurant;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BeanManager {

    @Bean
    public List<Restaurant> DataSource(){
        return new ArrayList<>();
    }
}
