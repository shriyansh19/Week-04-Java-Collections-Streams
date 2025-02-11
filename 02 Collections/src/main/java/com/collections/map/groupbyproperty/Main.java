package com.collections.map.groupbyproperty;

import java.util.List;
import java.util.Map;

// Main class to demonstrate grouping employees by department
public class Main {
    public static void main(String[] args) {
        List<GroupByPropertySolution.Employee> employees = List.of(
                new GroupByPropertySolution.Employee("Alice", "HR"),
                new GroupByPropertySolution.Employee("Bob", "IT"),
                new GroupByPropertySolution.Employee("Carol", "HR")
        );

        GroupByPropertySolution grouper = new GroupByPropertySolution();
        Map<String, List<GroupByPropertySolution.Employee>> groupedEmployees = grouper.groupByDepartment(employees);

        System.out.println("Grouped Employees: " + groupedEmployees);
    }
}