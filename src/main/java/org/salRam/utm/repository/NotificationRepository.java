package org.salRam.utm.repository;

import java.util.List;

import org.salRam.utm.model.Notification;

public interface NotificationRepository {
	public List<Notification> getNotifications();
	public Notification getNotification(String id);
	public Notification createNotification(String subject, String message, List<String> toAddress, List<String> ccAddress);
	public Notification updateNotification(String id, Notification notification);
	public void addNotification(Notification notification); 
}
