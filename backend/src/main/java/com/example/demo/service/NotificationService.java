<<<<<<< HEAD
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendNotification(String message) {
        // Send to all clients subscribed to /topic/notifications
        messagingTemplate.convertAndSend("/topic/notifications", message);
    }
}
=======
package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Autowired
    private SimpMessagingTemplate messagingTemplate;

    public void sendNotification(String message) {
        // Send to all clients subscribed to /topic/notifications
        messagingTemplate.convertAndSend("/topic/notifications", message);
    }
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
