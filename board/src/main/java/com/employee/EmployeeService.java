package com.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    public void save(EmployeeDTO employeeDTO) {
        employeeRepository.save(employeeDTO);
    }
}
