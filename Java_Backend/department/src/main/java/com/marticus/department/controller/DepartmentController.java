package com.marticus.department.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marticus.department.entity.DepartmentEntity;
import com.marticus.department.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@PostMapping("/")
	public ResponseEntity<Void>saveCustomer(@RequestBody DepartmentEntity departmentEntity)
	{
		
		return ResponseEntity.status(HttpStatus.CREATED).header("Records", "Created").build();
	}

	@GetMapping("/{id}")
	public ResponseEntity<DepartmentEntity> getDepartmentById(@PathVariable("id") int id)
	{
		DepartmentEntity departmentEntity = departmentService.findDepartmentById(id);
		return ResponseEntity.ok(departmentEntity);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<DepartmentEntity>> getDepartmentById()
	{
		List<DepartmentEntity> dept = departmentService.findAllDepartments();
		return ResponseEntity.ok(dept);
	}
	
//	@GetMapping("/name/{departmentName}")
//	public ResponseEntity<DepartmentEntity> getDepartmentByName(@PathVariable String departmentName) {
//
//		DepartmentEntity dept=departmentService.findDepartmentByDepartmentName(departmentName);
//		return ResponseEntity.ok(dept);
//	} 
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteDepartmenytById(@PathVariable() Long id)
	{
		String body="Record deleted successfully";
		
		Boolean delStatus=departmentService.deleteDepartmentById(id);
		if(!delStatus)
		{
			body = "Could not delete the record";
		}
		
		return ResponseEntity.ok().body(body);
	}
	
	
	
	@PutMapping("/")
	public ResponseEntity<String> updateDepartment(@RequestBody DepartmentEntity dept){
		String strUpdateStatus="data updated successfully";
		departmentService.updateDepartment(dept);
		return ResponseEntity.ok().body("ok");
	}
	
	
	
	
	
}