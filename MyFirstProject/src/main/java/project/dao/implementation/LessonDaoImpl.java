package project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import project.dao.LessonDao;
import project.domain.Course;
import project.domain.Lesson;

@Repository("lessonDao")
public class LessonDaoImpl extends BaseDaoImpl<Lesson> implements LessonDao {
	

	public LessonDaoImpl() {
		super(Lesson.class);
		// TODO Auto-generated constructor stub
	}
	@Transactional
	public List<Lesson> findByCourseId(int lessonId) {
		try {
			return entityManager.createNamedQuery(Lesson.FIND_LESSON_BY_COURSEID).setParameter("lessonId", lessonId).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}
	@Transactional
	public void insert(Lesson lesson) {
		entityManager.persist(lesson);
	}

	@Transactional
	public List<Lesson> getAll() {
		List<Lesson> list = entityManager.createQuery("FROM Lesson").getResultList();
		return list;
	}
}
