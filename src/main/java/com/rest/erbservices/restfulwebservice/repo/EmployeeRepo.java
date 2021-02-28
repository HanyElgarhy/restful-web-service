package com.rest.erbservices.restfulwebservice.repo;

import com.rest.erbservices.restfulwebservice.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
