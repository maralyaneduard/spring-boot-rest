package com.em.auto.DTO;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by eduardm on 11/16/16.
 */

public class CommentDTO {

    private Long commentId;
    private String commentText;
    private Integer commentRating;
    private UserDTO userDto;

    public CommentDTO() {
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
    public UserDTO getUser() {
        return userDto;
    }
    public void setUser(UserDTO userDto) {
        this.userDto = userDto;
    }
}
