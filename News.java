package projectSystem;

import java.util.Comparator;
import java.util.Objects;
import java.util.Vector;

public class News {
	public String topic;
	public String content;
	public Vector<String> comments;
	public Vector<News> newsList = new Vector<>();
	public int pinnedNews;
	public static final int NOT_PINNED = -1;
	
	public News(String topic, String content) {
		this.topic = topic;
		this.content = content;
		this.comments = new Vector<>();
		this.pinnedNews = NOT_PINNED;
	}
	
	public void setTopic(String topic) {
        this.topic = topic;
    }
	
	public String getTopic() {
        return this.topic;
    }
	
	public void setContent(String content) {
        this.content = content;
    }
    public String getContent() {
        return this.content;
    }
    
    public Vector<String> getComments() {
        return this.comments;
    }
    
    public void addComment(String comment) {
        this.comments.add(comment);
    }
    
    public void addNews(News news) {
        newsList.add(news);
    }
    
    public void pinNews(int news) {
        this.pinnedNews = news;
    }

    public int getPinnedOrder() {
        return pinnedNews;
    }
    
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        News other = (News) obj;
        return this.topic.equals(other.topic) && this.content.equals(other.content);
    }
    
    public int hashCode() {
        return Objects.hash(topic, content);
    }
    
    public String toString() {
        return "News [topic=" + topic + ", content=" + content + ", comments=" + comments + "]";
    }
    

    public static class PinnedNewsComparator implements Comparator<News> {
        public int compare(News news1, News news2) {
            // Reverse the order to make pinned news come first
            return Integer.compare(news2.getPinnedOrder(), news1.getPinnedOrder());
        }
    }
 
}
