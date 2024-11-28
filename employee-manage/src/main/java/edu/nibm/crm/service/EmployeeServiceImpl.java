package edu.nibm.crm.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import edu.nibm.crm.dto.Employee;
import edu.nibm.crm.entity.EmployeeEntity;
import edu.nibm.crm.repository.EmployeeRepository;
import edu.nibm.crm.service.impl.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
@Service
public class EmployeeServiceImpl implements EmployeeService {

    final EmployeeRepository repository;

    @Override
    public void addEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new ObjectMapper().convertValue(employee, EmployeeEntity.class);
        repository.save(employeeEntity);
    }

    @Override
    public List<EmployeeEntity> getAll() {
        return repository.findAll();
    }
}
