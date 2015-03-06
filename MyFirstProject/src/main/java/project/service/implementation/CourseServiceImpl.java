package project.service.implementation;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.CourseDao;
import project.domain.Course;
import project.service.CourseService;

@Service("courseService")
public class CourseServiceImpl implements CourseService {
	
	@Autowired
	private CourseDao courseDao;

	public CourseDao getCourseDao() {
		return courseDao;
	}

	public void setCourseDao(CourseDao courseDao) {
		this.courseDao = courseDao;
	}

	public void insert(Course course) {
		courseDao.insert(course);		
	}

	public List<Course> getAll() {

		return courseDao.getAll();
	}

	public Course findByTeacherId(int teacherId) {
		return (Course) courseDao.findByTeacherId(teacherId);
	}

	public Course findById(int id) {
		return courseDao.findById(id);
	}

	public Course update(int id) {
		return courseDao.update(id);
	}


}
