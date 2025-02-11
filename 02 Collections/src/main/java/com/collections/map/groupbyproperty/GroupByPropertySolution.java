package com.collections.map.groupbyproperty;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.stream.Collectors;

// Class to group employees by their department
public class GroupByPropertySolution {

    // Represents an employee
    static class Employee {
        String name;
        String department;

        public Employee(String name, String department) {
            this.name = name;
            this.department = department;
        }

        public String getDepartment() {
            return department;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    // Groups employees by their department
    public Map<String, List<Employee>> groupByDepartment(List<Employee> employees) {
        return employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
    }
}