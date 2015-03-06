package project.service;

import java.util.List;

import project.domain.Course;
import project.domain.Lesson;

public interface LessonService {

	void insert (Lesson lesson);
	List<Lesson> getAll();
	Lesson findByCourseId(int lessonId);
}
