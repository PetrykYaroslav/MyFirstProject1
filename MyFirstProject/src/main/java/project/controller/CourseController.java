package project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import project.domain.Course;
import project.service.CourseService;

@Controller
public class CourseController {

	@Autowired
	CourseService service;

	@RequestMapping(value = "/showCourse")
	public String showAll(Model model) {
		List<Course> course = service.getAll();
		model.addAttribute("course", course);
		return "project-course";
	}

	@RequestMapping(value = "/createCourse")
	public String create() {
		return "project-newCourse";
	}

	@RequestMapping(value = "/showCourse", method = RequestMethod.POST)
	public String createCourse(@RequestParam(value = "cost") String cost,
			@RequestParam(value = "quantityLessons") String quantityLessons,
			@RequestParam(value = "timeCourse") String timeCourse,
			@RequestParam(value = "titleCourse") String titleCourse) {
		int costInt = Integer.parseInt(cost);
		int quantityLessonsInt = Integer.parseInt(quantityLessons);
		int timeCourseInt = Integer.parseInt(timeCourse);
		Course course = new Course(titleCourse, timeCourseInt,
				quantityLessonsInt, costInt);
		service.insert(course);
		return "redirect:/showCourse";
	}

	@RequestMapping(value = "/find")
	public String find() {
		return "project-findById";
	}

	@RequestMapping(value = "/findById", method = RequestMethod.POST)
	public String findById(@RequestParam(value = "id") String id, Model model) {
		int idInt = Integer.parseInt(id);
		Course course = service.findById(idInt);
		model.addAttribute("course", course);
		return "project-find-course";
	}

	@RequestMapping(value = "/updatePage")
	public String updatePage() {
		return "project-update";
	}

	@RequestMapping(value = "/edit", method = RequestMethod.POST)
	public String update(@RequestParam(value = "id") String id,
			@RequestParam(value = "cost") String cost,
			@RequestParam(value = "quantityLessons") String quantityLessons,
			@RequestParam(value = "timeCourse") String timeCourse,
			@RequestParam(value = "titleCourse") String titleCourse) {
		int idInt = Integer.parseInt(id);
		int costInt = Integer.parseInt(cost);
		int quantityLessonsInt = Integer.parseInt(quantityLessons);
		int timeCourseInt = Integer.parseInt(timeCourse);
		service.update(idInt, titleCourse, timeCourseInt, quantityLessonsInt, costInt);

		/*
		 * Course course = new Course(titleCourse, timeCourseInt,
		 * quantityLessonsInt, costInt); service.update(course);
		 * 
		 * model.addAttribute("id");
		 */

		return "project-course";
	}

}
