package projectSystem;

import java.util.Objects;

public class Message {
	public String content;
	public String sender;
	public String receiver;
	private String title;
	
	public Message(String content, String sender, String receiver, String title) {
        this.content = content;
        this.sender = sender;
        this.receiver = receiver;
        this.title = title;
    }
	
	public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        if (!Objects.equals(content, message.content)) return false;
        if (!Objects.equals(sender, message.sender)) return false;
        if (!Objects.equals(receiver, message.receiver)) return false;
        return Objects.equals(title, message.title);
    }

    @Override
    public int hashCode() {
        int result = content != null ? content.hashCode() : 0;
        result = 31 * result + (sender != null ? sender.hashCode() : 0);
        result = 31 * result + (receiver != null ? receiver.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Message: " +
                "body = '" + content + '\'' +
                ", sender = " + sender +
                ", receiver = " + receiver;
    }
	
	
	
}
