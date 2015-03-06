package project.dao;

import java.util.List;

import project.domain.Student;
import project.domain.Teacher;

public interface TeacherDao  extends BaseDao<Teacher> {

	Teacher findByTeacherId(int id);
}
