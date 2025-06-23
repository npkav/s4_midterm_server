package com.keyin.server.repository;

import com.keyin.server.entity.Feedback;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
    @Query("SELECT AVG(feedback.rating) FROM Feedback feedback WHERE feedback.repId = ?1")
    Double findAverageRatingByRepId(Long repId);
    List<Feedback> findByRepId(Long repId);
    List<Feedback> findByRating(int rating);
}