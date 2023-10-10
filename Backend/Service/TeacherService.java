package com.student.sfa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.sfa.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	TeacherRepository teacherRepository;
	@Transactional(readOnly=true)
	public boolean verifyTeacher(String tname,int tid)
	{
		int count= teacherRepository.verifyTeacher(tname,tid);
		if(count>0)
			return true;
		return false;
	}
}
