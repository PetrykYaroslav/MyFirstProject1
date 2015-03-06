package project.dao;

import java.util.List;

import project.domain.Student;

public interface StudentDao extends BaseDao<Student> {
	
	Student findByStudentId(int id);
}
