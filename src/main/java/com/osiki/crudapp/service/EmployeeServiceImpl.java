package com.osiki.crudapp.service;

import com.osiki.crudapp.entity.EmployeeEntity;
import com.osiki.crudapp.model.EmployeeModel;
import com.osiki.crudapp.repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeModel createEmployee(EmployeeModel employeeModel) {

        EmployeeEntity employeeEntity = new EmployeeEntity();

        BeanUtils.copyProperties(employeeModel, employeeEntity);
        employeeRepository.save(employeeEntity);
        return employeeModel;
    }
}
