package project.dao;

import java.util.List;

import project.domain.Course;
import project.domain.Teacher;

public interface BaseDao<E> {

	void add(E entity);
	E update(E entity);
	List<E> getAll();
	void delete(E entity);
	E findById(int id);
	
}
