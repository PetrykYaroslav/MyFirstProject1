package project.dao;

import java.util.List;

import project.domain.Course;

public interface CourseDao extends BaseDao<Course> {

	List<Course> findByTeacherId(int teacherId);
}
