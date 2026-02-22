package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.schema.Employee;
import org.example.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
@AllArgsConstructor
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping("/getAll")
    public List<Employee> getAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/addEmployee")
    public void addEmployee(@RequestBody EmployeeDto employeeDto) {
        employeeService.addEmployee(employeeDto);
    }
}
