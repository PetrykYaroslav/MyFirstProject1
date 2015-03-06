package project.service;

import java.util.List;

import project.domain.Course;
import project.dto.CourseDTO;

public interface CourseService {

	void insert (Course course);
	Course update(int id);
	List<Course> getAll();
	Course findById(int id);
}
