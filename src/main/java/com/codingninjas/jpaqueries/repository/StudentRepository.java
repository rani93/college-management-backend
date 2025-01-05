package com.codingninjas.jpaqueries.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.codingninjas.jpaqueries.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAllByCoursesName(String course);

	/* TODO:
	   Write the derived query which finds the list of all the students
	   enrolled in a given course.
	   Answer List<Student> findByCoursesName(String courseName);
	 */

}
