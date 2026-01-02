<<<<<<< HEAD
package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admins")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    
    @Column
    private String resetToken;

    @Column
    private LocalDateTime resetTokenExpiry;


    @Enumerated(EnumType.STRING)
    private Role role; // Always Role.ADMIN
}
=======
package com.example.demo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "admins")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Admin {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    
    @Column
    private String resetToken;

    @Column
    private LocalDateTime resetTokenExpiry;


    @Enumerated(EnumType.STRING)
    private Role role; // Always Role.ADMIN
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
