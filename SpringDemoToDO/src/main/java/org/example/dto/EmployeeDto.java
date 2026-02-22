package org.example.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmployeeDto {

    private String name;
    private String department;
    private Integer age;

}

