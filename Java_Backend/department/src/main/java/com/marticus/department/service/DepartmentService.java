package com.marticus.department.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marticus.department.entity.DepartmentEntity;
import com.marticus.department.repo.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	DepartmentRepository departmentRepository;
	
	public void saveCustomer(DepartmentEntity departmentEnt) {
		
		
		departmentRepository.save(departmentEnt);
	}
	
	public DepartmentEntity findDepartmentById(long id)
	{
		return departmentRepository.findDepartmentById(id);
//		return departmentRepository.findDepartmentRepositoryById(id);
	}

	public List<DepartmentEntity> findAllDepartments() {
		return departmentRepository.findAll();
		
//		return null;
	}
	
	public Boolean deleteDepartmentById(Long id) {
		
		DepartmentEntity dept=departmentRepository.findDepartmentById(id);
		if(dept!=null)
		{
			departmentRepository.delete(dept);
			return true;
		}
		
		return false;
	}
	
	public void updateDepartment (DepartmentEntity dept) {
		// TODO Auto-generated method stub
		DepartmentEntity deptDB=departmentRepository.findDepartmentById(dept.getId());
		deptDB.setDepartmentCode(dept.getDepartmentCode());
		deptDB.setDepartmentName(dept.getDepartmentName());
		departmentRepository.save(deptDB);
	}
	
	
}
