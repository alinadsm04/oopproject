package teamproject;

import java.util.Date;
import java.util.Objects;

/**
* @generated
*/
public class ResearchPaper implements Comparable<ResearchPaper>, Cloneable{
    
    /**
    * @generated
    */
    private String title;
    /**
    * @generated
    */
    private String publisher;
    /**
    * @generated
    */
    private Date dateOfConference;
    /**
    * @generated
    */
    private String doi;
    /**
    * @generated
    */
    private int pages;
    /**
    * @generated
    */
    private Researcher authors;
    /**
    * @generated
    */
    private Format format;
    private String citations;
    private int counter = 0;
    
    
    

    /**
    * @generated
    */
    public String getTitle() {
        return title;
    }
    /**
    * @generated
    */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
    * @generated
    */
    public String getPublisher() {
        return publisher;
    }
    /**
    * @generated
    */
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    /**
    * @generated
    */
    public Date getDateOfConference() {
        return dateOfConference;
    }
    /**
    * @generated
    */
    public void setDateOfConference(Date dateOfConference) {
        this.dateOfConference = dateOfConference;
    }
    /**
    * @generated
    */
    public String getDoi() {
        return doi;
    }
    /**
    * @generated
    */
    public void setDoi(String doi) {
        this.doi = doi;
    }
    /**
    * @generated
    */
    public int getPages() {
        return pages;
    }
    /**
    * @generated
    */
    public void setPages(Integer pages) {
        this.pages = pages;
    }
    /**
    * @generated
    */
    public Researcher getAuthors() {
        return authors;
    }
    /**
    * @generated
    */
    public void setAuthors(Researcher authors) {
        this.authors = authors;
    }
    /**
    * @generated
    */
    public Format getFormat() {
        return format;
    }
    /**
    * @generated
    */
    public void setFormat(Format format) {
        this.format = format;
    }
    public String getCitations() {
    	return citations;
    }
    public void setCitations(String citations) {
    	this.citations = citations;
    }
    
    
    
    

    //                          Operations                                  
    
    public int countCitations() {
    	counter++;
    	return counter;
    }
    /**
    * @generated
    */
    public void getCitation() {
    	if(citations.contains(publisher)){
    		countCitations();
    	}
        
    }
    public String getCitation(Format f) {
    	if(f == Format.BIBTEXT) {
    		return "BibiText citation";
    	}else if (f == Format.PLAINTEXT) {
    		return "PlainText citation";
    	}
    	return "";
    }
    
	@Override
	public String toString() {
		return "ResearchPaper [title=" + title + ", publisher=" + publisher + ", dateOfConference=" + dateOfConference
				+ ", doi=" + doi + ", pages=" + pages + ", authors=" + authors + ", format=" + format + ", citations="
				+ citations + ", counter=" + counter + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(authors, citations, counter, dateOfConference, doi, format, pages, publisher, title);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ResearchPaper other = (ResearchPaper) obj;
		return Objects.equals(authors, other.authors) && Objects.equals(citations, other.citations)
				&& counter == other.counter && Objects.equals(dateOfConference, other.dateOfConference)
				&& Objects.equals(doi, other.doi) && format == other.format && pages == other.pages
				&& Objects.equals(publisher, other.publisher) && Objects.equals(title, other.title);
	}
    @Override
	public int compareTo(ResearchPaper r) {
		if(this.pages < r.pages)return -1;
		if(this.pages > r.pages)return 1;
		return 0;
	}
    
    @Override
    public Object clone() throws CloneNotSupportedException {
    	ResearchPaper r = (ResearchPaper)super.clone();
    	return r;
    }
	
	
	
	
    
    
    
}
