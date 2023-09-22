package com.department.service;

import java.util.List;

import javax.websocket.server.ServerEndpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.department.entity.Department;
import com.department.repo.DeptRepo;


@Service
public class DeptServices {

	@Autowired
	DeptRepo deptRepo;
	
	public List<Department> getAllDepts(){
		
		return deptRepo.findAll();
	}
	
	public Department getDeptById(int id){
		
		return deptRepo.findById(id).orElse(null);
	}
	
	public Department postDept(Department dept) {
		
		return deptRepo.save(dept);
		
	}

}
