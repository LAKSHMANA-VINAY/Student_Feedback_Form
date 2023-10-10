package com.student.sfa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.student.sfa.service.TeacherService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class TeacherController {

	@Autowired
	TeacherService teacherService;
	
	@GetMapping(value="/verifyTeacher/{tname}/{tid}",produces="application/json")
	public HttpStatus verifyTeacher(@PathVariable String tname,@PathVariable int tid)
	{
		if(teacherService.verifyTeacher(tname,tid))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	
}
