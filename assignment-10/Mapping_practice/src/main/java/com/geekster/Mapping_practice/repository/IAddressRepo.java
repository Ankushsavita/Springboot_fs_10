package com.geekster.Mapping_practice.repository;

import com.geekster.Mapping_practice.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAddressRepo extends JpaRepository<Address, Long> {
}
