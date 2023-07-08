package com.geekster.EmployeeAddress.repository;

import com.geekster.EmployeeAddress.model.Address;
import org.springframework.data.repository.CrudRepository;

public interface IAddressRepo extends CrudRepository<Address,Long> {
}
