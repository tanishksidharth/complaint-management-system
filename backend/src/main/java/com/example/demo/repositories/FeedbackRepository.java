<<<<<<< HEAD
package com.example.demo.repositories;

import com.example.demo.entity.Citizen;
import com.example.demo.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByFeedbackBy(Citizen citizen);
}
=======
package com.example.demo.repositories;

import com.example.demo.entity.Citizen;
import com.example.demo.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    List<Feedback> findAllByFeedbackBy(Citizen citizen);
}
>>>>>>> 93052c3527979bbe0994a8181da42a63e265a230
