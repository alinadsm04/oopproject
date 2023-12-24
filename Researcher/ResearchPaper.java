package projectSystem;


import java.util.Date;
import java.util.Objects;


public class ResearchPaper implements Comparable<ResearchPaper>, Cloneable{
    
    
    private String title;
    private String publisher;
    private Date dateOfPublication;
    private String doi;
    private int pages;
    private Researcher author;
    private Format format;
    private int[] citations;
    private int counter = 0;
 
    
    
    public String getTitle() {
        return title;
    }
  
    public void setTitle(String title) {
        this.title = title;
    }
   
    public String getPublisher() {
        return publisher;
    }
   
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
   
    public Date getDateOfConference() {
        return dateOfPublication;
    }
  
    public void setDateOfConference(Date dateOfConference) {
        this.dateOfPublication = dateOfConference;
    }
   
    public String getDoi() {
        return doi;
    }
   
    public void setDoi(String doi) {
        this.doi = doi;
    }
    
    public int getPages() {
        return pages;
    }
   
    public void setPages(Integer pages) {
        this.pages = pages;
    }
   
    public Researcher getAuthors() {
        return author;
    }
  
    public void setAuthors(Researcher authors) {
        this.author = authors;
    }
   
    public Format getFormat() {
        return format;
    }
    
    public void setFormat(Format format) {
        this.format = format;
    }
    public int[] getCitations() {
    	return citations;
    }
    public void setCitations(int[] citations) {
    	this.citations = citations;
    }
    
    
    //                          Operations                                  
    
    public int countCitations() {
    	counter++;
    	return counter;
    }
    

    public String getCitation(Format f) {
    	if (f == Format.BIBTEXT) {
    		return "ResearchPaper [title=" + title + ", publisher=" + publisher + ", dateOfPublication=" + dateOfPublication
    				+ ", doi=" + doi + ", pages=" + pages + ", author=" + author + ", format=" + format + ", citations="
    				+ citations + ", counter=" + counter + "]";
    	} else {
    		return "Title: " + title + "\n" 
    				+ "publisher: " + publisher + "\n"
    				+ "date of publication: " + dateOfPublication + "\n"
    				+ "doi: " + doi + "\n"
    				+ "pages: " + pages + "\n"
    				+ "author: " + author + "\n"
    				+ "format: " + format + "\n"
    				+ "citations: " + citations;	
    	}
    }
    
   
	@Override
	public String toString() {
		return "ResearchPaper [title=" + title + ", publisher=" + publisher + ", dateOfPublication=" + dateOfPublication
				+ ", doi=" + doi + ", pages=" + pages + ", author=" + author + ", format=" + format + ", citations="
				+ citations + ", counter=" + counter + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, citations, counter, dateOfPublication, doi, format, pages, publisher, title);
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
		return Objects.equals(author, other.author) && Objects.equals(citations, other.citations)
				&& counter == other.counter && Objects.equals(dateOfPublication, other.dateOfPublication)
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
    	ResearchPaper paper = (ResearchPaper)super.clone();
    	return paper;
    }
 
}
