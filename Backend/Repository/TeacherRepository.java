package com.student.sfa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.student.sfa.entity.TeacherEntity;

public interface TeacherRepository extends JpaRepository<TeacherEntity,Integer>{

	@Query(value="select count(*) from teacher t where t.tname=?1 and t.tid=?2",nativeQuery=true)
	public int verifyTeacher(String tname,int tid);
}
