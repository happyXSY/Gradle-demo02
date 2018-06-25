package com.grable.demo.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.grable.demo.entity.Employee;
import com.grable.demo.service.EmployeeService;
@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	static Logger log=LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public List<Employee> list() {
		log.info("EmployeeService执行中。。。");
		List<Employee> list=new ArrayList<>();
		list.add(new Employee(1,"xushenyu","安徽 合肥"));
		list.add(new Employee(2,"xushenyu","安徽 合肥"));
		list.add(new Employee(3,"AA","hehe"));
		list.add(new Employee(4,"合肥","高新区"));
		return list;
	}
	
	
	

}
