package com.student.sfa.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.sfa.entity.StudentEntity;
public interface StudentRepository extends JpaRepository<StudentEntity,String>{

	@Query(value="select s.std_branch,s.cal_year,s.std_sem,s.std_year,s.std_section from student s where s.std_regno=?1",nativeQuery=true)
	public List<Object[]> getStudentDetails(String std_regno);
	
	@Query(value="select s.tid,s.sname from subject s where s.branch=?1 and s.cal_year=?2 and s.year=?3 and s.section=?4",nativeQuery=true)
	public List<Object[]> getTeacherDetails(String branch,int cal_year,int year,String section);
	
	@Query(value="select count(*) from student s where s.std_regno=?1 and s.std_pwd=?2",nativeQuery=true)
	public int verifyStudent(String uname,String password);
	

}
