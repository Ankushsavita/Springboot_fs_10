package com.geekster.RestaurantApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Restaurant {
    private Integer restaurantId;
    private String restaurantName;
    private String restaurantAddress;
    private Double restaurantNumber;
    private String restaurantSpeciality;
    private Double restaurantTotalStaffs;
}
