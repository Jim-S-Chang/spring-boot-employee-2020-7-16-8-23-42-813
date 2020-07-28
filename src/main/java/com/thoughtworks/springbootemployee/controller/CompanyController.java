package com.thoughtworks.springbootemployee.controller;

import com.thoughtworks.springbootemployee.entity.Employee;
import com.thoughtworks.springbootemployee.service.CompanyService;
import com.thoughtworks.springbootemployee.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies")
public class CompanyController {
    CompanyService companyService=new CompanyService();

    @PostMapping(path = "")
    public boolean addCompany(@RequestBody() Company company){
        return companyService.addEmployee(company);
    }
}

