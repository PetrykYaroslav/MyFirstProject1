package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.domain.Course;
import project.domain.Lesson;
import project.domain.Teacher;
import project.service.LessonService;

@Controller
public class LessonController {

	@Autowired
	LessonService service;
	
	@RequestMapping(value = "/showLesson")
	public String showAll (Model model) {
		List<Lesson> lesson = service.getAll();
		model.addAttribute("lesson", lesson);
		return "project-lesson";
	}
	
	@RequestMapping(value = "/createLesson")
	public String create() {
		return "project-newLesson";
	}
	
	@RequestMapping(value = "/showLesson", method = RequestMethod.POST)
	public String createCourse(
			@RequestParam(value = "subject") String subject,
			@RequestParam(value = "timeLesson") String timeLesson, 
			@RequestParam(value = "courseId") String courseId) {
		int timeLessonInt = Integer.parseInt(timeLesson);
		int courseIdInt = Integer.parseInt(courseId);
		Lesson lesson = new Lesson(subject, timeLessonInt, new Course());
		service.insert(lesson);
		return "redirect:/showLesson";
	}
}
