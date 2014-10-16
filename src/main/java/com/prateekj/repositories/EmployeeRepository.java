package com.prateekj.repositories;

import com.prateekj.models.Employee;
import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
