<<<<<<< HEAD
package com.example.demo.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CitizenNotificationSocket {

    @MessageMapping("/notify")           // Frontend sends messages here
    @SendTo("/topic/notifications")      // Backend broadcasts to this topic
    public String sendNotification(String message) {
        return "Notification: " + message;
    }
}
=======
package com.example.demo.websocket;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class CitizenNotificationSocket {

    @MessageMapping("/notify")           // Frontend sends messages here
    @SendTo("/topic/notifications")      // Backend broadcasts to this topic
    public String sendNotification(String message) {
        return "Notification: " + message;
    }
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
