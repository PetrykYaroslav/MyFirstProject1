package project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import project.dao.CourseDao;
import project.domain.Course;

@Repository("courseDao")
public class CourseDaoImpl extends BaseDaoImpl<Course> implements CourseDao {

	Course course;

	public CourseDaoImpl() {
		super(Course.class);
		// TODO Auto-generated constructor stub
	}

	@Transactional
	public List<Course> findByTeacherId(int teacherId) {
		try {
			return entityManager
					.createNamedQuery(Course.FIND_COURSE_BY_TEACHERID)
					.setParameter("teacherId", teacherId).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Transactional
	public void insert(Course course) {
		entityManager.persist(course);
	}

	@Transactional
	public List<Course> getAll() {
		List<Course> list = entityManager.createQuery("FROM Course")
				.getResultList();
		return list;
	}

	@Transactional
	public Course findById(int id) {
		return (Course) entityManager.createNamedQuery(Course.FIND_BY_ID)
				.setParameter("id", id).getSingleResult();

	}
	
	@Transactional
	public Course update(int id) {
		return (Course) entityManager.createNamedQuery(Course.UPDATE_BY_ID).setParameter("id", id);
	}
}
