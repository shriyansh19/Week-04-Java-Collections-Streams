package com.collections.map.groupbyproperty;

import org.junit.jupiter.api.Test;
import java.util.List;
import java.util.Map;
import static org.junit.jupiter.api.Assertions.*;

class GroupByPropertyTest {

    @Test
    void testGroupByDepartment() {
        GroupByPropertySolution grouper = new GroupByPropertySolution();
        List<GroupByPropertySolution.Employee> employees = List.of(
                new GroupByPropertySolution.Employee("Alice", "HR"),
                new GroupByPropertySolution.Employee("Bob", "IT"),
                new GroupByPropertySolution.Employee("Carol", "HR")
        );

        Map<String, List<GroupByPropertySolution.Employee>> groupedEmployees = grouper.groupByDepartment(employees);
        assertEquals(2, groupedEmployees.size());
        assertEquals(List.of("Alice", "Carol"), groupedEmployees.get("HR"));
        assertEquals(List.of("Bob"), groupedEmployees.get("IT"));
    }
}