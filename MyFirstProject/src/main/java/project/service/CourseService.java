package project.service;

import java.util.List;

import project.domain.Course;
import project.dto.CourseDTO;

public interface CourseService {

	void insert (Course course);
	Course update(int id, String titleCourse, int timeCourse, int quantityLessons, int cost);
	List<Course> getAll();
	Course findById(int id);
}
