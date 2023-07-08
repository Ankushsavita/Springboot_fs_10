package com.geekster.EmployeeAddress.service;

import com.geekster.EmployeeAddress.model.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepo employeeRepo;

    public void addEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    public Iterable<Employee> getEmployees() {
        return employeeRepo.findAll();
    }

    public Optional<Employee> getEmployeeById(Long employeeId) {
        return employeeRepo.findById(employeeId);
    }

    public String updateEmployeeById(Long employeeId, Employee employee) {
        Optional<Employee> myEmployeeOpt = employeeRepo.findById(employeeId);
        Employee myEmployee = null;
        if(myEmployeeOpt.isPresent()){
            myEmployee = myEmployeeOpt.get();
        }else{
            return "Id not found!!";
        }
        myEmployee.setEmployeeId(myEmployee.getEmployeeId());
        myEmployee.setFirstName(myEmployee.getFirstName());
        myEmployee.setLastName(myEmployee.getLastName());
        myEmployee.setAddress(myEmployee.getAddress());
        employeeRepo.save(myEmployee);
        return "employee  updated";
    }

    public String deleteEmployeeById(Long employeeId) {
         employeeRepo.deleteById(employeeId);
         return "deleted";
    }
}
