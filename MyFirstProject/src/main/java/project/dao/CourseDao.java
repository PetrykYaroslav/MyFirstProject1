package project.dao;

import java.util.List;

import project.domain.Course;

public interface CourseDao extends BaseDao<Course> {

	void insert (Course course);
	List<Course> getAll();
	Course findById(int id);
	Course update(int id);
	List<Course> findByTeacherId(int teacherId);
}
