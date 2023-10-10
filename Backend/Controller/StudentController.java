package com.student.sfa.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.student.sfa.entity.StudentEntity;
import com.student.sfa.service.StudentService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	
	@GetMapping(value="/student/{std_regno}",produces="application/json")
	public ResponseEntity<StudentEntity> getOneStudent(@PathVariable String std_regno)
	{
		StudentEntity e=studentService.getOneStudent(std_regno);
		if(e!=null)
			return new ResponseEntity<StudentEntity>(e,HttpStatus.OK);
		return new ResponseEntity<StudentEntity>(e,HttpStatus.NOT_FOUND);
	}
	
	@PutMapping(value="/",consumes="application/json")
	public HttpStatus modifyEmployee(@RequestBody StudentEntity emp)
	{
		if(studentService.modifyStudent(emp))
			return HttpStatus.OK;
		return HttpStatus.NOT_MODIFIED;
	}
	
	@PostMapping(value="/",consumes="application/json")
	public HttpStatus addStudent(@RequestBody StudentEntity emp)
	{
		if(studentService.insertStudent(emp))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	
	@GetMapping(value="/studentDetails/{std_regno}",produces="application/json")
	public ResponseEntity<List<Object[]>> getStudentDetails(@PathVariable String std_regno)
	{
		List<Object[]> e=studentService.getStudentDetails(std_regno);
		if(e!=null)
		{
			return new ResponseEntity<List<Object[]>>(e,HttpStatus.OK);
		}
		return new ResponseEntity<List<Object[]>>(e,HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/teacher/{branch}/{cal_year}/{year}/{section}",produces="application/json")
	public ResponseEntity<List<Object[]>> getTeacherDetails(@PathVariable String branch,@PathVariable int cal_year,@PathVariable int year,@PathVariable String section)
	{
		List<Object[]> e=studentService.getTeacherDetails(branch,cal_year,year,section);
		if(e!=null)
		{
			return new ResponseEntity<List<Object[]>>(e,HttpStatus.OK);
		}
		return new ResponseEntity<List<Object[]>>(e,HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/verifyStudent/{uname}/{password}",produces="application/json")
	public HttpStatus verifyStudent(@PathVariable String uname,@PathVariable String password)
	{
		if(studentService.verifyStudent(uname,password))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}
	

}
