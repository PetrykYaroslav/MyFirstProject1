package project.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import project.dao.BaseDao;
import project.dao.CourseDao;
import project.dao.LessonDao;
import project.dao.StudentDao;
import project.dao.TeacherDao;
import project.domain.Lesson;
import project.service.CourseService;
import project.service.LessonService;

@Service("lessonService")
public class LessonServiceImpl implements LessonService {

	@Autowired
	private LessonDao lessonDao;

	public LessonDao getLessonDao() {
		return lessonDao;
	}

	public void setLessonDao(LessonDao lessonDao) {
		this.lessonDao = lessonDao;
	}

	public void insert(Lesson lesson) {
		lessonDao.insert(lesson);
	}

	public List<Lesson> getAll() {
		return lessonDao.getAll();
	}

	public Lesson findByCourseId(int lessonId) {
		return (Lesson) lessonDao.findByCourseId(lessonId);
	}
	
}
