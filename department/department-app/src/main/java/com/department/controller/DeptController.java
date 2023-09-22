package com.department.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.department.entity.Department;
import com.department.repo.DeptRepo;
import com.department.service.DeptServices;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/depts")
@Slf4j
public class DeptController {

	@Autowired
	DeptServices deptRepo;
	
	@GetMapping
	public List<Department> getAllDepts(){
		log.info("into the getAllDepts");
		return deptRepo.getAllDepts();
	}
	
	@GetMapping("/{id}")
	public Department getDeptById(@PathVariable int id){
		log.info("into the getDeptById");
		return deptRepo.getDeptById(id);
	}
	
	
	@PostMapping
	public Department postDept(@RequestBody Department dept) {
		log.info("into the postDept");
		return deptRepo.postDept(dept);
		
	}
	
}
