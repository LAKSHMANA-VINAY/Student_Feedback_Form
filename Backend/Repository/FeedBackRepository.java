package com.student.sfa.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.student.sfa.compositekey.CompositeKey;
import com.student.sfa.entity.FeedBackEntity;
public interface FeedBackRepository extends JpaRepository<FeedBackEntity,CompositeKey>{

	@Query(value="select f.comments from feedback f where f.tid=?1 and f.std_year=?2 and f.std_branch=?3 and f.cal_year=?4 and f.std_section=?5",nativeQuery=true)
	public List<Object[]> getComments(int tid,int year,String branch,int cal_year,String section);
	
	@Query(value="select sum(f.q1)/count(f.q1),sum(f.q2)/count(f.q2),sum(f.q3)/count(f.q3),sum(f.q4)/count(f.q4),sum(f.q5)/count(f.q5) from feedback f where f.tid=?1 and f.std_year=?2 and f.std_branch=?3 and f.cal_year=?4 and f.std_section=?5",nativeQuery=true)
	public List<Object[]> getRatings(int tid,int year,String branch,int cal_year,String section);
	
	@Query(value="select s.branch,s.section,s.sname,s.year,s.sem from subject s where s.tid=?1 and s.cal_year=?2",nativeQuery=true)
	public List<Object[]>getAcademicDetails(int tid,int cal_year);

}
