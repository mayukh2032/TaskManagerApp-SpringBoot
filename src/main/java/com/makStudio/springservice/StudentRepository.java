package com.makStudio.springservice;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface  StudentRepository extends CrudRepository<Student, Integer> {
	 //List<Student> findByStudentId(@Param("studentfalse") int StudentId);
	 List<Student> findByStudentName(@Param("name") String studentName);
	}

