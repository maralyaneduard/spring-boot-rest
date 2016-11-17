package com.em.auto.DTO;

import com.em.auto.entity.Auto;

import java.util.Set;

/**
 * Created by eduardm on 11/16/16.
 */
public class UserDTO {

    private Long userId;
    private String userName;
    private Auto auto;
    private Set<CommentDTO> comments;

    public UserDTO() {
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public Set<CommentDTO> getComments() {
        return comments;
    }

    public void setComments(Set<CommentDTO> comments) {
        this.comments = comments;
    }
}