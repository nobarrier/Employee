package com.hybrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hybrid.mapper.EmpMapper;
import com.hybrid.model.Emp;

@Service
public class EmpService {
	
	//필드주입
	@Autowired
	EmpMapper empMapper;
	
	@Transactional
	public List<Emp> getList() {
		
		List<Emp> Emps = empMapper.selectAll();
		
		return Emps;
	}
	
	@Transactional
	public Emp getEmp(Integer Empno) {
		return empMapper.selectByEmpno(Empno);
	}
	
	@Transactional
	public void insert(Emp Emp) {
		empMapper.insert(Emp);
	}
	
	@Transactional
	public Emp delete(Integer Empno) {
		
		Emp Emp = empMapper.selectByEmpno(Empno);
		empMapper.deleteByEmpno(Empno);
		return Emp;
	}
	
	
	
	
	
}
