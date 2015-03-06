package project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import project.dao.StudentDao;
import project.domain.Course;
import project.domain.Student;

@Repository("studentDao")
public class StudentDaoImpl extends BaseDaoImpl<Student> implements StudentDao {

	public StudentDaoImpl() {
		super(Student.class);
		// TODO Auto-generated constructor stub
	}


	public Student findByStudentId(int id) {
		try {
			return (Student) entityManager.createNamedQuery(Student.FIND_BY_STUDENT_ID).setParameter("id", id).getResultList();
		} catch (NoResultException e) {
			return null;
		}
	}

}
