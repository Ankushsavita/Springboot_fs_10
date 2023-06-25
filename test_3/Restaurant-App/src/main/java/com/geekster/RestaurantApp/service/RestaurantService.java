package com.geekster.RestaurantApp.service;

import com.geekster.RestaurantApp.model.Restaurant;
import com.geekster.RestaurantApp.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantRepo restaurantRepo;

    public String addRestaurants(Restaurant restaurant) {
        restaurantRepo.restaurant(restaurant);
        return "Restaurant added successfully...!";
    }

    public List<Restaurant> getAllRestaurants() {
        return restaurantRepo.restaurants();
    }

    public Restaurant getRestaurantById(Integer restaurantId) {
        for(Restaurant restaurant: restaurantRepo.restaurants){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                return restaurant;
            }
        }
          throw new IllegalStateException("restaurantId not found");
    }

    public String updateRestaurantInfo(Integer restaurantId, Restaurant newrestaurant) {
        for(Restaurant restaurant: restaurantRepo.restaurants){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurant.setRestaurantId(newrestaurant.getRestaurantId());
                restaurant.setRestaurantName(newrestaurant.getRestaurantName());
                restaurant.setRestaurantAddress(newrestaurant.getRestaurantAddress());
                restaurant.setRestaurantNumber(newrestaurant.getRestaurantNumber());
                restaurant.setRestaurantSpeciality(newrestaurant.getRestaurantSpeciality());
                restaurant.setRestaurantTotalStaffs(newrestaurant.getRestaurantTotalStaffs());

                return "restaurant updated for restaurant ID:" + restaurantId;
            }
        }
        return "restaurant not found for restaurant ID:" + restaurantId;
    }

    public String deleteRestaurantById(Integer restaurantId) {
        for(Restaurant restaurant: restaurantRepo.restaurants){
            if(restaurant.getRestaurantId().equals(restaurantId)){
                restaurantRepo.delete(restaurant);
                return "restaurant deleted for restaurant ID " + restaurantId;
            }
        }
        return "restaurant not found for restaurant ID " + restaurantId;
    }
}
