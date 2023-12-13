package study;

import java.util.ArrayList;
import java.util.List;

public class Transcript {

    private List<Lesson> lessons;
    private Student student;
    private Course course;
    private Mark mark;

    public Transcript() {
        this.lessons = new ArrayList<>();
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Mark getMark() {
        return mark;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
    
    public String calculateGPA() {
    	Mark transcriptMark = getMark();
    	if (transcriptMark != null) {
	        if (transcriptMark.totalGrade >= 95 && transcriptMark.totalGrade <= 100) 
	            return "4.0"; 
	            if (transcriptMark.totalGrade >= 90) 
	                return "3.67"; 
	            if (transcriptMark.totalGrade >= 85) 
	                return "3.33"; 
	            if (transcriptMark.totalGrade >= 80) 
	                return "3.0"; 
	            if (transcriptMark.totalGrade >= 75) 
	                return "2.67"; 
	            if (transcriptMark.totalGrade >= 70) 
	                return "2.33"; 
	            if (transcriptMark.totalGrade >= 65) 
	                return "2.0"; 
	            if (transcriptMark.totalGrade >= 60) 
	                return "1.67"; 
	            if (transcriptMark.totalGrade >= 55) 
	                return "1.33"; 
	            if (transcriptMark.totalGrade >= 50) 
	                return "1.00"; 
	            else  
	                return "0.0";
	    	} else {
	            return "No mark available for GPA calculation";
	        }
        
    }


}