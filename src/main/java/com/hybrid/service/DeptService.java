package com.hybrid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hybrid.mapper.DeptMapper;
import com.hybrid.model.Dept;

@Service
public class DeptService {
	
	//필드주입
	@Autowired
	DeptMapper DeptMapper;
	
	@Transactional
	public List<Dept> getList() {
		
		List<Dept> Depts = DeptMapper.selectAll();
		
		return Depts;
	}
	
	@Transactional
	public Dept getDept(Integer Deptno) {
		return DeptMapper.selectByDeptno(Deptno);
	}
	
	@Transactional
	public void insert(Dept Dept) {
		DeptMapper.insert(Dept);
	}
	
	@Transactional
	public Dept delete(Integer Deptno) {
		
		Dept Dept = DeptMapper.selectByDeptno(Deptno);
		DeptMapper.deleteByDeptno(Deptno);
		return Dept;
	}
	
	
	
	
	
}
