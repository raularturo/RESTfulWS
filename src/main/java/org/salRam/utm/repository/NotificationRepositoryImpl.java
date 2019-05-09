package org.salRam.utm.repository;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

import org.salRam.utm.model.Notification;
import org.springframework.stereotype.Repository;

@Repository("notificationRepository")
public class NotificationRepositoryImpl implements NotificationRepository{
private static Map<String, Notification> notificationDB = new Hashtable<>();
	
	@Override
	public List<Notification> getNotifications() {
		List<Notification> notificationList = new ArrayList<Notification>();
		notificationList.addAll(notificationDB.values());
		return notificationList;
	}

	@Override
	public Notification getNotification(String id) {
		return notificationDB.get(id);
	}

	@Override
	public Notification createNotification(String subject, String message, List<String> toAddress, List<String> ccAddress) {
		Notification notification = new Notification(subject, message, toAddress, ccAddress);
		notificationDB.put(notification.getMessageId(), notification);
		return notification;
	}

	@Override
	public Notification updateNotification(String id, Notification notification) {
		notificationDB.put(id, notification);
		return notification;
	}

	@Override
	public void addNotification(Notification notification) {
		notificationDB.put(notification.getMessageId(), notification);
	}
}
