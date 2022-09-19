package com.example.demo.service;

import com.example.demo.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class EmployeeService {

    public Employee addNewEmployee(Employee employee){
        employee.setId(new Random().nextInt(68736432));
        //add employee to database
        return employee;
    }
}
