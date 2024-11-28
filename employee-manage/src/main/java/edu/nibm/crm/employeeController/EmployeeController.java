package edu.nibm.crm.employeeController;

import edu.nibm.crm.dto.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/emp-controller")
public class EmployeeController {

    List<Employee> employeeList = new ArrayList();

    @PostMapping("add-employee")
    public void addEmployee(@RequestBody Employee employee) {
        employeeList.add(employee);
    }

}
