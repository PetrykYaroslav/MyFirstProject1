package project.dao;

import java.util.List;

import project.domain.Lesson;

public interface LessonDao extends BaseDao<Lesson> {
	
	List<Lesson> findByCourseId(int lessonId);
}
