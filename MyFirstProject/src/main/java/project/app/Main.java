package project.app;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import project.controller.CourseController;
import project.dao.BaseDao;
import project.dao.CourseDao;
import project.dao.LessonDao;
import project.dao.StudentDao;
import project.dao.TeacherDao;
import project.dao.implementation.BaseDaoImpl;
import project.domain.Course;
import project.domain.Lesson;
import project.domain.Student;
import project.domain.Teacher;
import project.service.CourseService;

public class Main {

	public static void main(String[] args) {

		ApplicationContext con = new ClassPathXmlApplicationContext("appContext.xml");
//		TeacherDao tDao = (TeacherDao) con.getBean("teacherDao");
//		LessonDao lDao = (LessonDao) con.getBean("lessonDao");
//		StudentDao sDao = (StudentDao) con.getBean("studentDao");
		CourseDao cDao = (CourseDao) con.getBean("courseDao");

		System.out.println(cDao.findById(1));

//		sDao.findByStudentId(1);
//		ldao.add(new Lesson("Lesson 1", 90, new Course("Java Advanced", 48, 24, 2800, new Teacher("Ростислав", "Міленевич", 25))));
//		sdao.add(new Student("Петро", "Порошенко", 46));
		
//		dao.add(new Course("asd", 48, 24, 2600, null));
//		switch (scan.nextInt()) {
//		case 1: {
//			daoImpl.add();
//			break;
//		}
//		case 2: {
//			daoImpl.delete();
//			break;
//		}
//		case 3: {
//			break;
//		}
//		case 4: {
//			daoImpl.get();
//			break;
//		}
		}
	

}
