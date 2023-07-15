package com.geekster.Mapping_practice.repository;

import com.geekster.Mapping_practice.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ILaptopRepo extends JpaRepository<Laptop,Long> {
}
