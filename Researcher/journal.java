package projectSystem;

import java.util.Date;
import java.util.List;
import java.util.Objects;


public class Journal implements Cloneable, Comparable<Journal>{
    
   
    private String name;
    private Date publishedDate;
    private Researcher editor;
    private List<ResearchPaper> articles;
    private final NotificationService notificationService;
    
    
    public Journal() {
    	notificationService = new NotificationService();
    }
    
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Date getPublishedDate() {
        return publishedDate;
    }
    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }
    public Researcher getEditor() {
        return editor;
    }
    public void setEditor(Researcher editor) {
        this.editor = editor;
    }
    public List<ResearchPaper> getArticles() {
        return articles;
    }
    public void setArticles(List<ResearchPaper> articles) {
        this.articles = articles;
    }
    public NotificationService getService() {
    	return notificationService;
    }
    
    
    
    

    //                          Operations                                  
    
   
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
