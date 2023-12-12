package teamproject;

import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
* @generated
*/
public class Journal implements Cloneable, Comparable<Journal>{
    
    /**
    * @generated
    */
    private String name;
    /**
    * @generated
    */
    private Date publishedDate;
    /**
    * @generated
    */
    private Researcher editor;
    /**
    * @generated
    */
    private List<ResearchPaper> articles;
    private final NotificationService notificationService;
    
    
    public Journal() {
    	notificationService = new NotificationService();
    }
    
    
    
    
    

    /**
    * @generated
    */
    public String getName() {
        return name;
    }
    /**
    * @generated
    */
    public void setName(String name) {
        this.name = name;
    }
    /**
    * @generated
    */
    public Date getPublishedDate() {
        return publishedDate;
    }
    /**
    * @generated
    */
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    /**
    * @generated
    */
    public Researcher getEditor() {
        return editor;
    }
    /**
    * @generated
    */
    public void setEditor(Researcher editor) {
        this.editor = editor;
    }
    /**
    * @generated
    */
    public List<ResearchPaper> getArticles() {
        return articles;
    }
    /**
    * @generated
    */
    public void setArticles(List<ResearchPaper> articles) {
        this.articles = articles;
    }
    public NotificationService getService() {
    	return notificationService;
    }
    
    
    
    

    //                          Operations                                  
    
    /**
    * @generated
    */
    public ResearchPaper publishPaper() {
        //TODO
        return null;
    }






	@Override
	public int hashCode() {
		return Objects.hash(articles, editor, name, notificationService, publishedDate);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Journal other = (Journal) obj;
		return Objects.equals(articles, other.articles) && Objects.equals(editor, other.editor)
				&& Objects.equals(name, other.name) && Objects.equals(notificationService, other.notificationService)
				&& Objects.equals(publishedDate, other.publishedDate);
	}
	
	@Override
	public String toString() {
		return "Journal [name=" + name + ", publishedDate=" + publishedDate + ", editor=" + editor + ", articles="
				+ articles + ", notificationService=" + notificationService + "]";
	}
	
	@Override
	public int compareTo(Journal j) {
		return this.publishedDate.compareTo(j.publishedDate);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		Journal j = (Journal)super.clone();
		return j;
	}
	
    
    
    
}
