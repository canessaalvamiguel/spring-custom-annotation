package com.example.demo.entities;

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

    private String employeeType;
}
