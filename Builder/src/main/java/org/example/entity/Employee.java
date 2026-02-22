package org.example.entity;

import lombok.Getter;

@Getter
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String dob;
    private Integer age;
    private String department;
    private Double salary;

    private Employee(Builder builder) {
        this.id = builder.id;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.dob = builder.dob;
        this.age = builder.age;
        this.department = builder.department;
        this.salary = builder.salary;
    }

    static public class Builder {
        private Integer id;
        private String firstName;
        private String lastName;
        private String dob;
        private Integer age;
        private String department;
        private Double salary;

        public Builder setId(Integer id) {
            this.id = id;
            return this;
        }

        public Builder setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder setDob(String dob) {
            this.dob = dob;
            return this;
        }

        public Builder setAge(Integer age) {
            this.age = age;
            return this;
        }

        public Builder setDepartment(String department) {
            this.department = department;
            return this;
        }

        public Builder setSalary(Double salary) {
            this.salary = salary;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }

    }

}
