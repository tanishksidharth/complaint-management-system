<<<<<<< HEAD
package com.example.demo.payload;

public class LoginResponse {
    private String message;
    private String token;
    private String role;  // new field

    public LoginResponse(String message, String token, String role) {
        this.message = message;
        this.token = token;
        this.role = role;
    }

    // Getters and setters
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
=======
package com.example.demo.payload;

public class LoginResponse {
    private String message;
    private String token;
    private String role;  // new field

    public LoginResponse(String message, String token, String role) {
        this.message = message;
        this.token = token;
        this.role = role;
    }

    // Getters and setters
    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getToken() { return token; }
    public void setToken(String token) { this.token = token; }

    public String getRole() { return role; }
    public void setRole(String role) { this.role = role; }
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
