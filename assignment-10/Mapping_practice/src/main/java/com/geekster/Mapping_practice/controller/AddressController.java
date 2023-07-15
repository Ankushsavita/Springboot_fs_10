package com.geekster.Mapping_practice.controller;

import com.geekster.Mapping_practice.model.Address;
import com.geekster.Mapping_practice.model.Student;
import com.geekster.Mapping_practice.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @GetMapping("addresses")
    public List<Address> getAllAddresses(){
        return addressService.getAllAddresses();
    }

    @PutMapping("address/{addressId}")
    public String updateAddressById(@PathVariable Long addressId, @RequestBody Address newAddress){
        return addressService.updateAddressById(addressId, newAddress);
    }

    @DeleteMapping("addresses/{addressId}")
    public String removeAddressById(@PathVariable Long addressId){
        return addressService.removeAddressById(addressId);
    }
}
