package teamproject;

import java.util.Objects;

/**
* @generated
*/
public class ResearchProject implements Cloneable{
    
    /**
    * @generated
    */
    private String topic;
    /**
    * @generated
    */
    private  ResearchPaper publishedPapers;
    /**
    * @generated
    */
    private Researcher  projectParticipant;
    
    
    

    /**
    * @generated
    */
    public String getTopic() {
        return topic;
    }
    /**
    * @generated
    */
    public void setTopic(String topic) {
        this.topic = topic;
    }
    /**
    * @generated
    */
    public ResearchPaper getPublishedPapers() {
        return publishedPapers;
    }
    /**
    * @generated
    */
    public void  setPublishedPapers(ResearchPaper publishedPapers) {
        this.publishedPapers = publishedPapers;
    }
    /**
    * @generated
    */
    public Researcher getProjectParticipant() {
        return projectParticipant;
    }
    /**
    * @generated
    */
    public void setProjectParticipant(Researcher projectParticipant) {
        this.projectParticipant =  projectParticipant;
    }
    
    
    
    
	@Override
	public int hashCode() {
		return Objects.hash(projectParticipant, publishedPapers, topic);
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
		return Objects.equals(projectParticipant, other.projectParticipant)
				&& Objects.equals(publishedPapers, other.publishedPapers) && Objects.equals(topic, other.topic);
	}
	@Override
	public String toString() {
		return "ResearchProject [topic=" + topic + ", publishedPapers=" + publishedPapers + ", projectParticipant="
				+ projectParticipant + "]";
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		ResearchProject project = (ResearchProject)super.clone();
		return project;
	}
	
	public void joinProject(User u) throws NonCustomerUserException{
		if (u.getClass() != Researcher) {
			throw NonCustomerUserException("You cannot join to project.");
		}
	}
    
    
    
    
    
    
}
