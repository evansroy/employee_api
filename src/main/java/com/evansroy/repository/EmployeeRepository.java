package com.evansroy.repository;

import com.evansroy.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //All crud database methods
}
