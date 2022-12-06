package com.example.long2.repositories;

import com.example.long2.models.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CommentRepository extends JpaRepository<Comment, Integer> {
    @Query(value = "SELECT count(commentID) FROM Comment where postID = :postID")
    Long countCommentByPostID(@Param("postID") int postID);
}
