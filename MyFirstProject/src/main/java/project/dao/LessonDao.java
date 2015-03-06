package project.dao;

import java.util.List;

import project.domain.Lesson;

public interface LessonDao extends BaseDao<Lesson> {
	
	void insert (Lesson lesson);
	List<Lesson> getAll();
	List<Lesson> findByCourseId(int lessonId);
}
