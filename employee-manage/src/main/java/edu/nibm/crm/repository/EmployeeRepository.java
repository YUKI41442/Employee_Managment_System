package edu.nibm.crm.repository;

import edu.nibm.crm.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends JpaRepository <EmployeeEntity, Long> {
}
