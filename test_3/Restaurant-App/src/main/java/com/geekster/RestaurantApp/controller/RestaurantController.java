package com.geekster.RestaurantApp.controller;

import com.geekster.RestaurantApp.model.Restaurant;
import com.geekster.RestaurantApp.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

    @PostMapping("restaurant")
    public String addRestaurants(@RequestBody Restaurant restaurant){
        return restaurantService.addRestaurants(restaurant);
    }

    @GetMapping("restaurants")
    public List<Restaurant> getAllRestaurants(){
        return restaurantService.getAllRestaurants();
    }

    @GetMapping("restaurants/{restaurantId}")
    public Restaurant getRestuarantById(@PathVariable Integer restaurantId){
        return restaurantService.getRestaurantById(restaurantId);
    }

    @PutMapping("restaurant/{restaurantId}")
    public String updateRestaurantInfo(@PathVariable Integer restaurantId, @RequestBody Restaurant restaurant){
        return restaurantService.updateRestaurantInfo(restaurantId, restaurant);
    }

    @DeleteMapping("restaurant/{restaurantId}")
    public String deleteRestaurantById(@PathVariable Integer restaurantId){
        return restaurantService.deleteRestaurantById(restaurantId);
    }
}
