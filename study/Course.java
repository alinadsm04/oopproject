package study;

import java.util.Objects;


public class Course implements Cloneable{
	private String courseId;
	private String courseName;
    private Teacher instructor;
    private ElectiveCourses electiveCourses;
    private int credits;

	public Teacher getInstructor() {
		return instructor;
	}
	public void setInstructor(Teacher instructor) {
		this.instructor = instructor;
	}
	public String getCourseId() {
		return courseId;
	}
	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}
	public ElectiveCourses getElectiveCourses() {
		return electiveCourses;
	}
	public void setElectiveCourses(ElectiveCourses electiveCourses) {
		this.electiveCourses = electiveCourses;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	public boolean isAvailable() {
	    return instructor != null;
	}
	
    public String isMajorElective(ElectiveCourses e) {
    	if (e == ElectiveCourses.MAJOR) {
    		return "Course is a MAJOR";
    	}
    	else {
    		return "Course is not a MAJOR";
    	}
    }
    public Object clone() throws CloneNotSupportedException {
        Course clone = (Course) super.clone();
        clone.setInstructor((Teacher) instructor.clone());
        return clone;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Course course = (Course) obj;
        return Objects.equals(courseId, course.courseId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(courseId);
    }
    
    
    
    
}
