package com.geekster.RestaurantApp.repository;

import com.geekster.RestaurantApp.model.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RestaurantRepo {

    @Autowired
    public List<Restaurant> restaurants;

    public void restaurant(Restaurant restaurant) {
        restaurants.add(restaurant);
    }

    public List<Restaurant> restaurants() {
        return restaurants;
    }

    public void delete(Restaurant restaurant) {
        restaurants.remove(restaurant);
    }
}
