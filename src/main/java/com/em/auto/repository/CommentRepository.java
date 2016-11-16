package com.em.auto.repository;

import com.em.auto.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by eduardm on 11/16/16.
 */
@Repository
public interface CommentRepository extends JpaRepository<Comment,Long> {
}
