package com.em.auto.DTO;

import com.em.auto.entity.Auto;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by eduardm on 11/16/16.
 */
@Entity(name = "user")
public class UserDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
    private Long userId;

    @Column(name = "user_name", unique = true)
    private String userName;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Auto auto;

    @OneToMany(mappedBy = "user", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<CommentDTO> comments;

    public User() {
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