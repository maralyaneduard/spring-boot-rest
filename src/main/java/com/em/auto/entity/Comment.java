package com.em.auto.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by eduardm on 11/16/16.
 */
@Entity(name = "comment")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "comment_id")
    private Long commentId;

    @Type(type = "text")
    @Column(name = "comment_text")
    private String commentText;

    @Column(name = "comment_rating")
    private Integer commentRating;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    public Comment() {
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public Integer getCommentRating() {
        return commentRating;
    }

    public void setCommentRating(Integer commentRating) {
        this.commentRating = commentRating;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
