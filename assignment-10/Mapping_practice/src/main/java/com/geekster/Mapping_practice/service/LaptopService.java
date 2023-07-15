package com.geekster.Mapping_practice.service;

import com.geekster.Mapping_practice.model.Address;
import com.geekster.Mapping_practice.model.Laptop;
import com.geekster.Mapping_practice.repository.ILaptopRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {

    @Autowired
    ILaptopRepo laptopRepo;

    public void addLaptop(Laptop laptop) {
        laptopRepo.save(laptop);
    }

    public List<Laptop> getAllLaptops() {
        return laptopRepo.findAll();
    }

    public String updateLaptopById(Long laptopId, Laptop newLaptop) {
        Optional<Laptop> myLaptopOpt = laptopRepo.findById(laptopId);

        Laptop myLaptop = null;

        if(myLaptopOpt.isPresent()){
            myLaptop = myLaptopOpt.get();
        }else{
            return "id not found";
        }

        myLaptop.setLaptopId(newLaptop.getLaptopId());
        myLaptop.setLaptopName(newLaptop.getLaptopName());
        myLaptop.setLaptopBrand(newLaptop.getLaptopBrand());
        myLaptop.setLaptopPrice(newLaptop.getLaptopPrice());

        laptopRepo.save(myLaptop);
        return "address updated";
    }

    public String removeLaptopById(Long laptopId) {
        laptopRepo.deleteById(laptopId);
        return "laptop deleted successfully : " + laptopId;
    }
}
