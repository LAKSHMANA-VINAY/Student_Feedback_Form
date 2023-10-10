package com.student.sfa.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.student.sfa.entity.FeedBackEntity;
import com.student.sfa.service.FeedBackService;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class FeedBackController {
	
	@Autowired
	FeedBackService feedbackService;
	
	@GetMapping(value="/comment/{tid}/{year}/{branch}/{cal_year}/{section}",produces="application/json")
	public ResponseEntity<List<Object[]>> getComments(@PathVariable int tid,@PathVariable int year,@PathVariable String branch,@PathVariable int cal_year,@PathVariable String section)
	{
		List<Object[]> e= feedbackService.getComments(tid,year,branch,cal_year,section);
		if(e!=null)
			return new ResponseEntity<List<Object[]>>(e,HttpStatus.OK);
		return new ResponseEntity<List<Object[]>>(e,HttpStatus.NOT_FOUND);
	}
	
	@GetMapping(value="/{tid}/{year}/{branch}/{cal_year}/{section}",produces="application/json")
	public ResponseEntity<List<Object[]>> getRatings(@PathVariable int tid,@PathVariable int year,@PathVariable String branch,@PathVariable int cal_year,@PathVariable String section)
	{
		List<Object[]> e= feedbackService.getRatings(tid,year,branch,cal_year,section);
		if(e!=null)
			return new ResponseEntity<List<Object[]>>(e,HttpStatus.OK);
		return new ResponseEntity<List<Object[]>>(e,HttpStatus.NOT_FOUND);
	}
	@GetMapping(value="/academic/{tid}/{cal_year}",produces="application/json")
	public ResponseEntity<List<Object[]>> getAcademicDetails(@PathVariable int tid,@PathVariable int cal_year)
	{
		List<Object[]> e= feedbackService.getAcademicDetails(tid,cal_year);
		if(e!=null)
			return new ResponseEntity<List<Object[]>>(e,HttpStatus.OK);
		return new ResponseEntity<List<Object[]>>(e,HttpStatus.NOT_FOUND);
	}
	
	@PostMapping(value="/student/feedback",consumes="application/json")
	public HttpStatus addFeedBack(@RequestBody FeedBackEntity fbk)
	{
		if(feedbackService.insertFeedBack(fbk))
			return HttpStatus.OK;
		return HttpStatus.NOT_FOUND;
	}

}
