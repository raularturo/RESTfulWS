package org.salRam.utm.service;

import java.util.List;
import org.salRam.utm.model.Notification;

public interface NotificationService {
	public List<Notification> getNotifications();
	public Notification notify(String subject, String message, List<String> toAddress, List<String> ccAddress);
}
