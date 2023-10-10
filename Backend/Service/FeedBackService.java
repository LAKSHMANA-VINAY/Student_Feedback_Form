package com.student.sfa.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.student.sfa.entity.FeedBackEntity;
import com.student.sfa.repository.FeedBackRepository;

@Service
public class FeedBackService {

	@Autowired
	FeedBackRepository feedbackRepository;
	
	@Transactional(readOnly=true)
	public List<Object[]> getComments(int tid,int year,String branch,int cal_year,String section)
	{
		return feedbackRepository.getComments(tid,year,branch,cal_year,section);
	}
	
	@Transactional(readOnly=true)
	public List<Object[]> getRatings(int tid,int year,String branch,int cal_year,String section)
	{
		return feedbackRepository.getRatings(tid,year,branch,cal_year,section);
	}
	@Transactional(readOnly=true)
	public List<Object[]> getAcademicDetails(int tid,int cal_year)
	{
		return feedbackRepository.getAcademicDetails(tid,cal_year);
	}
	
	@Transactional
	public boolean insertFeedBack(FeedBackEntity fb)
	{
		return feedbackRepository.save(fb)!=null;
	}

}
