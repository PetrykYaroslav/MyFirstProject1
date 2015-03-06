package project.domain;
import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "Course")
@NamedQueries({
	@NamedQuery(name = Course.FIND_COURSE_BY_TEACHERID, query = Course.FIND_COURSE_BY_TEACHERID_QUERY),
	@NamedQuery(name = Course.FIND_BY_ID, query = Course.FIND_BY_ID_QUERY),
	@NamedQuery(name = Course.UPDATE_BY_ID, query = Course.UPDATE_BY_ID_QUERY)
})
public class Course implements Serializable {
	public static final String FIND_COURSE_BY_TEACHERID = "Course.findByTeacherId";
	public static final String FIND_BY_ID = "Course.findById";
	public static final String UPDATE_BY_ID = "Course.update";
	
	public static final String FIND_COURSE_BY_TEACHERID_QUERY = "SELECT c FROM Course c WHERE c.teacher.id = :teacherId";
	public static final String FIND_BY_ID_QUERY = "SELECT c FROM Course c WHERE c.id = :id";
	public static final String UPDATE_BY_ID_QUERY = "UPDATE Course c SET c.cost = :cost, c.quantityLessons = :quantityLessons, c.timeCourse = :timeCourse, c.titleCourse = :titleCourse WHERE c.id = :id";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String titleCourse;
	private int timeCourse;
	private int quantityLessons;
	private int cost;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "teacherId")
	private Teacher teacher;
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "course")
	private List<Lesson> lesson;
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "studentId")
	private List<Student> student;
	
	public Course() {
		
	}

	public Course(String titleCourse, int timeCourse, int quantityLessons,
			int cost) {
		this.titleCourse = titleCourse;
		this.timeCourse = timeCourse;
		this.quantityLessons = quantityLessons;
		this.cost = cost;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitleCourse() {
		return titleCourse;
	}

	public void setTitleCourse(String titleCourse) {
		this.titleCourse = titleCourse;
	}

	public int getTimeCourse() {
		return timeCourse;
	}

	public void setTimeCourse(int timeCourse) {
		this.timeCourse = timeCourse;
	}

	public int getQuantityLessons() {
		return quantityLessons;
	}

	public void setQuantityLessons(int quantityLessons) {
		this.quantityLessons = quantityLessons;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public List<Lesson> getLesson() {
		return lesson;
	}

	public void setLesson(List<Lesson> lesson) {
		this.lesson = lesson;
	}

	public List<Student> getStudent() {
		return student;
	}

	public void setStudent(List<Student> student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", titleCourse=" + titleCourse
				+ ", timeCourse=" + timeCourse + ", quantityLessons="
				+ quantityLessons + ", cost=" + cost + ", teacher=" + teacher
				+ ", lesson=" + lesson + ", student=" + student + "]";
	}
	
}
