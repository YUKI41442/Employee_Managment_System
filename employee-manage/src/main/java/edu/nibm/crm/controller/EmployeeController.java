package edu.nibm.crm.controller;

import edu.nibm.crm.dto.Employee;
import edu.nibm.crm.entity.EmployeeEntity;
import edu.nibm.crm.service.impl.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emp-controller")
@RequiredArgsConstructor
public class EmployeeController {

   final EmployeeService service;

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee) {
        service.addEmployee(employee);
    }

    @GetMapping("get-all")
    public List<Employee> getAll(){
        new ArrayList<>();
        return service.getAll();
    }

}
