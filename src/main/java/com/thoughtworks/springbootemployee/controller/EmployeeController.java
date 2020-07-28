package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
    EmployeeService employeeService=new EmployeeService();
    @GetMapping(path = "")
    public List<Employee> getAll() {
        return employeeService.getAll();
    }

    @PostMapping(path = "")
    public boolean addEmployee(@RequestBody() Employee employee){
        return employeeService.addEmployee(employee);
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteOne(@PathVariable int id){
        return employeeService.deleteEmployee(id);
    }

    @PutMapping(path = "")
    public boolean updateOne(@RequestBody() Employee employee) {
        return employeeService.updateOne(employee);
    }

    @GetMapping(path = "/{id}")
    public Employee getEmployee(@PathVariable int id){
        return employeeService.getEmployeeById(id);
    }
}