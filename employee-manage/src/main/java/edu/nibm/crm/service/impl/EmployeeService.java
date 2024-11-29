package edu.nibm.crm.service.impl;

import edu.nibm.crm.dto.Employee;
import edu.nibm.crm.entity.EmployeeEntity;

import java.util.ArrayList;
import java.util.List;

public interface EmployeeService {

    List<Employee> employeeList = new ArrayList();

    void addEmployee(Employee employee);
    List<Employee> getAll();
}
