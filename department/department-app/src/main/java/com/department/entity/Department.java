package com.department.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int departmentId;
	String departmentName;
	String departmentHead;
	int departmentStaff;

}
