package teamproject;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
	
	private final List<User> subscribers;
	
	public NotificationService() {
		subscribers = new ArrayList<>();
	}
	
	public void subscribe(User subscriber) {
		subscribers.add(subscriber);
	}
	
	public void unsubscribe(User subscriber) {
		subscribers.remove(subscriber);
	}
	
	public void notify() {
		subscribers.forEach(subscriber -> User.update());
	}

}
