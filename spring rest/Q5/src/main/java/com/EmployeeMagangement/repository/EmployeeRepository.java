package com.EmployeeMagangement.repository;
import org.springframework.data.repository.CrudRepository;

import com.EmployeeMagangement.model.Employee;



// interface extending crud repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
}
