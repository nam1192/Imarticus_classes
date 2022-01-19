package com.marticus.employees.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.marticus.employees.entity.EmployeesEntity;


@Repository
public interface EmployeesRepo  extends JpaRepository<EmployeesEntity, Integer>{

	EmployeesEntity findEmployeeById(int id);

	EmployeesEntity findEmployeeByEmpId(int empId);

	EmployeesEntity findEmployeesByProjectId(int id);


}

