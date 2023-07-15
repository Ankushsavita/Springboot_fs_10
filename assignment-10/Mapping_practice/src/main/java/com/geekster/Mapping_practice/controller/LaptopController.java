package com.geekster.Mapping_practice.controller;

import com.geekster.Mapping_practice.model.Laptop;
import com.geekster.Mapping_practice.model.Student;
import com.geekster.Mapping_practice.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {

    @Autowired
    LaptopService laptopService;

    @PostMapping("laptop")
    public void addLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
    }

    @GetMapping("laptops")
    public List<Laptop> getAllLaptops(){
        return laptopService.getAllLaptops();
    }

    @PutMapping("laptop/{laptopId}")
    public String updateLaptopById(@PathVariable Long laptopId, @RequestBody Laptop newLaptop){
        return laptopService.updateLaptopById(laptopId,newLaptop);
    }

    @DeleteMapping("laptops/{laptopId}")
    public String removeLaptopById(@PathVariable Long laptopId){
        return laptopService.removeLaptopById(laptopId);
    }
}
