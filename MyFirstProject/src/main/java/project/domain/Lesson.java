package project.domain;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "Lesson")
@NamedQueries({
	@NamedQuery(name = Lesson.FIND_LESSON_BY_COURSEID, query = Lesson.FIND_LESSON_BY_COURSEID_QUERY)
})
public class Lesson implements Serializable {

	public static final String FIND_LESSON_BY_COURSEID = "Lesson.findByCourseId";
	
	public static final String FIND_LESSON_BY_COURSEID_QUERY = "SELECT l FROM Lesson l WHERE l.course.id = :courseId";
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String subject;
	private int timeLesson;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "courseId")
	private Course course;
	
	public Lesson() {
	
	}

	public Lesson(String subject, int timeLesson, Course course) {
		super();
		this.subject = subject;
		this.timeLesson = timeLesson;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getTimeLesson() {
		return timeLesson;
	}

	public void setTimeLesson(int timeLesson) {
		this.timeLesson = timeLesson;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Lesson [id=" + id + ", subject=" + subject + ", timeLesson="
				+ timeLesson + ", course=" + course + "]";
	}
	
}
