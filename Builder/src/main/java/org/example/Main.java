package org.example;

import org.example.entity.Employee;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee.Builder()
                .setId(7)
                .setFirstName("sravan kumar")
                .setLastName("Mummadi")
                .setDob("07-05-1998")
                .setAge(27)
                .setDepartment("CSE")
                .setSalary(1000000.00)
                .build();

        System.out.println(employee.getId());
        System.out.println(employee.getFirstName());
        System.out.println(employee.getLastName());
        System.out.println(employee.getDob());
        System.out.println(employee.getAge());
        System.out.println(employee.getDepartment());
        System.out.println(employee.getSalary());
        System.out.println(employee);

    }
}