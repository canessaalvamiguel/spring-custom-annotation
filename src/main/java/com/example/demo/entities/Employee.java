package com.example.demo.entities;

import com.example.demo.validation.ValidateEmployeeType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private int id;

    @NotBlank(message = "name shouldn't be null or empty")
    private String name;

    @Email(message = "invalid email id")
    private String email;

    //Custom annotation with default message
    //@ValidateEmployeeType
    //Custom annotation with custom message
    @ValidateEmployeeType(message = "Invalid employeeType")
    private String employeeType;
}
