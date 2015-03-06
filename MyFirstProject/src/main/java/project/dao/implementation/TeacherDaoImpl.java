package project.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import project.dao.TeacherDao;
import project.domain.Course;
import project.domain.Teacher;

@Repository("teacherDao")
public class TeacherDaoImpl extends BaseDaoImpl<Teacher> implements TeacherDao {

	public TeacherDaoImpl() {
		super(Teacher.class);
		// TODO Auto-generated constructor stub
	}

	public Teacher findByTeacherId(int id) {
		try {
			return (Teacher) entityManager.createQuery(Teacher.FIND_BY_TEACHERID).setParameter("id", id).getResultList();
		} catch (NoResultException e){
			return null;
		}
	}

}
