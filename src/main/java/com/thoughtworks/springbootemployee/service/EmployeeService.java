package com.thoughtworks.springbootemployee.service;

import com.thoughtworks.springbootemployee.entity.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeService {
    private List<Employee> employees;

    public EmployeeService() {
        employees=new ArrayList<>();
    }

    public boolean addEmployee(Employee employee){
        this.employees.add(employee);
        if (employees.contains(employee))
            return true;
        return false;
    }

    public List getAll() {
        return employees;
    }

    public boolean deleteEmployee(int id) {
        return employees.removeIf(e->e.getId()==id);
    }

    public boolean updateOne(Employee employee) {
        if (employees.stream().noneMatch(e -> e.getId() == employee.getId())){
            return false;
        }
        employees.removeIf(e->e.getId()==employee.getId());
        employees.add(employee);
        return true;
    }

    public Employee getEmployeeById(int id) {
        return employees.stream().filter(e->e.getId()==id).collect(Collectors.toList()).get(0);
    }
}
