package projectSystem;

public class Manager extends Employee { 
	
public ManagerType managerType;

	public Manager() {
	      super();
	    }
	    
	    public Manager(String id, String firstName, String lastName) {
	    super(id, firstName, lastName);
	  }
	    
	    public Manager(String id, String firstName, String lastName, String username, String password) {
	      super(id, firstName, lastName, username, password);
	  }
	    
	    public ManagerType getManagerType() {
	      return this.managerType;
	    }
	    
	    public void setManagerType(ManagerType managerType) {
	      this.managerType = managerType;
	    }

	    public void approveRegistration(Student student, Course course) {
	        if (this.managerType == ManagerType.OR) {
	            if (student.getTotalCredits() + course.getCredits() <= 21) {
		            System.out.println("Registration approved for " + student.getFirstName() +
		            		student.getLastName() + " in course " + course.getCourseName());
		            student.registerForCourse(course);
	            } 
	            else {
	            	System.out.println("Adding course " + course.getCourseName() +
	            			" would exceed 21 credits for " + student.getFirstName() +
		            		student.getLastName());
	            }
	        }
	        
	    }
	    
	    public void addCourses(String courseName, int credits, String courseId, Teacher instructor) {
		    Course newCourse = new Course(courseName, credits, courseId, instructor);
		        if (this.managerType == ManagerType.OR) {
		        	if (!Data.course.stream().anyMatch(course -> course.getCourseId().equals(courseId))) {
		                Data.course.add(newCourse);
		            } else {
		                System.out.println("Course with ID " + courseId + " already exists.");
		            }
		        } 
	    }
	    public void viewInfoAbtStudent(Student s) {
	    	StringBuilder result = new StringBuilder();
	        for (User user : Data.users) {
	            if (user instanceof Student) {
	                Student st = (Student) user;
	                result.append(String.format(
	                        "Student Name: %s\nStudent surname: %s\nBirth Date: %s\nEmail: %s\nID: %s\nYear of Study: %s\nFaculty: %s\nDegree: %s\n\n",
	                        st.getName(), st.getSurname(), st.getBirthDate(), st.getEmail(), st.getId(),
	                        st.getYearOfStudy(), st.getFaculty(), st.getDegree()));
	            }
	        }
	        System.out.println(result.toString());
	    }
	    
	  
	  public void createStatisticalReports() {
	    // TODO implement me  
	  }

	  public void assignCoursesToTeachers() {
	    // TODO implement me  
	  }
	  
	  public void addNews(String topic, String content) {
		  if (this.managerType == ManagerType.DEPARTMENT) {
			  News news = new News(topic, content);
		      if (!Data.news.contains(news)) {
		       	Data.news.add(news);
		      } 
		  }
	  }
	  
	  public void updateNews(News n, String content) {
		  if (this.managerType == ManagerType.DEPARTMENT) {
	        n.setContent(content);
		  }
	  }
	  
	  public void deleteNews(News n) {
		  if (this.managerType == ManagerType.DEPARTMENT)
			  Data.news.remove(n);
	  		}
	    }
	  
	
}