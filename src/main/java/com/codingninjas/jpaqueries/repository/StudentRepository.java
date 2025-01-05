package com.codingninjas.jpaqueries.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codingninjas.jpaqueries.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

	/* TODO:
	   Write the derived query which finds the list of all the students
	   enrolled in a given course.
	 */

}
