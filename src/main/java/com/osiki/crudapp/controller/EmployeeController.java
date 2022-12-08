package com.osiki.crudapp.controller;

import com.osiki.crudapp.model.EmployeeModel;
import com.osiki.crudapp.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/")
public class EmployeeController {

    private EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/employee")

    public EmployeeModel createEmployee(@RequestBody EmployeeModel employeeModel){
        return employeeService.createEmployee(employeeModel);
    }
}
