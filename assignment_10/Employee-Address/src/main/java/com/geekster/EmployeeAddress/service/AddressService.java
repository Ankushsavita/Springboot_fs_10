package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Address;
import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public Iterable<Address> getAddresses() {
       return addressRepo.findAll();
    }

    public Optional<Address> getAddressById(Long addressId) {
        return addressRepo.findById(addressId);
    }

    public String updateAddressById(Long addressId, Address address) {
        Optional<Address> myAddressOpt = addressRepo.findById(addressId);
        Address myAddress = null;
        if(myAddressOpt.isPresent()){
            myAddress = myAddressOpt.get();
        }else{
            return "Id not found!!";
        }
        myAddress.setAddressId(myAddress.getAddressId());
        myAddress.setStreet(myAddress.getStreet());
        myAddress.setCity(myAddress.getCity());
        myAddress.setState(myAddress.getState());
        myAddress.setZipCode(myAddress.getZipCode());
        addressRepo.save(myAddress);
        return "address  updated";
    }

    public String deleteAddressById(Long addressId) {
        addressRepo.deleteById(addressId);
        return "deleted";
    }
}
