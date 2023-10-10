package com.student.sfa.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.sfa.entity.StudentEntity;
import com.student.sfa.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository studentRepository;

	@Transactional
	public boolean insertStudent(StudentEntity std)
	{
		return studentRepository.save(std)!=null;
	}
	
	@Transactional
	public boolean modifyStudent(StudentEntity std)
	{
		return studentRepository.save(std)!=null;
	}
	
	@Transactional(readOnly=true)
	public StudentEntity getOneStudent(String std_regno)
	{
		Optional<StudentEntity> std=studentRepository.findById(std_regno);
		if(std.isPresent())
			return std.get();
		return null;
	}
	
	@Transactional(readOnly=true)
	public List<Object[]> getStudentDetails(String std_regno)
	{
		return studentRepository.getStudentDetails(std_regno);
	}
	@Transactional(readOnly=true)
	public List<Object[]> getTeacherDetails(String branch,int cal_year,int year,String section)
	{
		return studentRepository.getTeacherDetails(branch,cal_year,year,section);
	}
	@Transactional(readOnly=true)
	public boolean verifyStudent(String uname,String password)
	{
		int count= studentRepository.verifyStudent(uname,password);
		if(count>0)
			return true;
		return false;
	}

}
