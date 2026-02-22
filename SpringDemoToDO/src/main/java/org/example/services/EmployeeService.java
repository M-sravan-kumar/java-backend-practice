package org.example.services;

import lombok.AllArgsConstructor;
import org.example.dto.EmployeeDto;
import org.example.repositories.EmployeeRepository;
import org.example.schema.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {

    private EmployeeRepository employeeRepository;

    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    public Employee addEmployee(EmployeeDto employeeDto) {
        Employee employee = new Employee();
        employee.setName(employeeDto.getName());
        employee.setDepartment(employeeDto.getDepartment());
        employee.setAge(employeeDto.getAge());
        return employeeRepository.save(employee);
    }

}
