package com.geekster.EmployeeAddress.controller;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class AddressController {

    @Autowired
    AddressService addressService;

    @PostMapping("address")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @GetMapping("addresses")
    public Iterable<Address> getAddresses(){
        return addressService.getAddresses();
    }

    @GetMapping("addresses/{addressId}")
    public Optional<Address> getAddressById(@PathVariable Long addressId){
        return addressService.getAddressById(addressId);
    }

    @PutMapping("address/{addressId}")
    public String updateAddressById(@PathVariable Long addressId, @RequestBody Address address){
        return addressService.updateAddressById(addressId, address);
    }


    @DeleteMapping("address/{addressId}")
    public String deleteAddressById(@PathVariable Long addressId){
        return addressService.deleteAddressById(addressId);
    }
}
