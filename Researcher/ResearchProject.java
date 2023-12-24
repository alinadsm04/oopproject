package projectSystem;

import java.util.Objects;
import java.util.Vector;


public class ResearchProject{
    
    
    private String topic;
    private  ResearchPaper publishedPapers;
    private Vector<Researcher> projectMembers;
    
    

    
    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }
    public ResearchPaper getPublishedPapers() {
        return publishedPapers;
    }
    public void setPublishedPapers(ResearchPaper publishedPapers) {
        this.publishedPapers = publishedPapers;
    }
    public Vector<Researcher> getProjectMembers(){
    	return projectMembers;
    }
    public void setProjectMembers(Vector<Researcher> projectMembers) {
    	this.projectMembers = projectMembers;
    }
  
    
	@Override
	public int hashCode() {
		return Objects.hash(projectMembers, publishedPapers, topic);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResearchProject other = (ResearchProject) obj;
		return Objects.equals(projectMembers, other.projectMembers)
				&& Objects.equals(publishedPapers, other.publishedPapers) && Objects.equals(topic, other.topic);
	}
	@Override
	public String toString() {
		return "ResearchProject [topic=" + topic + ", publishedPapers=" + publishedPapers + ", projectParticipant="
				+ projectMembers + "]";
	}

	//public void joinProject(User u) throws NonCustomerUserException{
	//	if (u.getClass() != Researcher) {
	//		throw NonCustomerUserException("You cannot join to project.");
	//	}
	//}
    
       
}
