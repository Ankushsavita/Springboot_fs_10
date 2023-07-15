package com.geekster.Mapping_practice.service;

import com.geekster.Mapping_practice.model.Address;
import com.geekster.Mapping_practice.model.Student;
import com.geekster.Mapping_practice.repository.IAddressRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressService {

    @Autowired
    IAddressRepo addressRepo;

    public void addAddress(Address address) {
        addressRepo.save(address);
    }

    public List<Address> getAllAddresses() {
        return addressRepo.findAll();
    }

    public String updateAddressById(Long addressId, Address newAddress) {

        Optional<Address> myAddressOpt = addressRepo.findById(addressId);

        Address myAddress = null;

        if(myAddressOpt.isPresent()){
            myAddress = myAddressOpt.get();
        }else{
            return "id not found";
        }

        myAddress.setAddressId(newAddress.getAddressId());
        myAddress.setDistrict(newAddress.getDistrict());
        myAddress.setState(newAddress.getState());
        myAddress.setZipcode(newAddress.getZipcode());
        myAddress.setLandmark(newAddress.getLandmark());
        myAddress.setCountry(newAddress.getCountry());

        addressRepo.save(myAddress);
        return "address updated";
    }

    public String removeAddressById(Long addressId) {
        addressRepo.deleteById(addressId);
        return "address deleted successfully" + addressId;
    }
}
