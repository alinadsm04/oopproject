package study;

import java.util.Date;
import java.util.Objects;

public class Lesson implements Cloneable{
	private Course course;
	private LessonType type;
    private int duration;
    private int room;
    private Date time;
    
    public Lesson(String lessonType, int duration, int room, Date time, LessonType type, Course course) {
    	this.course = course;
    	this.type = type;
    	this.duration = duration;
    	this.room = room;
    	this.time = time;
    }
    

	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}

	public LessonType getType() {
		return type;
	}
	public void setType(LessonType type) {
		this.type = type;
	}

	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}

	public boolean equals(Object obj) {
		if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
		Lesson other = (Lesson) obj;
		return this.getCourse().getCourseName().equals(other.getCourse().getCourseName()) && this.getType()==other.getType();
	}
	
	public int hashCode() {
		return Objects.hash(course, type, duration, room, time);
	}
	
	public Object clone() throws CloneNotSupportedException {
		Lesson other = (Lesson) super.clone();
        other.setCourse((Course) course.clone());
		return other;
	}
	
	public String toString() {
		return this.getCourse().getCourseName() + ": " + this.getType() + this.getTime() + "-" + (this.getTime().getTime() + this.getDuration());
	}
    
}
