<<<<<<< HEAD
package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {

    // For login
    Citizen findByEmail(String email);
    
 // For reset password
    Citizen findByResetToken(String resetToken);
}
=======
package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Citizen;

@Repository
public interface CitizenRepository extends JpaRepository<Citizen, Long> {

    // For login
    Citizen findByEmail(String email);
    
 // For reset password
    Citizen findByResetToken(String resetToken);
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
