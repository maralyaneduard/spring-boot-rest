package com.em.auto.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Created by eduardm on 11/16/16.
 */
@Entity(name = "auto")
public class Auto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "auto_id")
    private Long autoId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "engine_id")
    private Engine engine;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(name = "auto_price")
    private Double autoPrice;

    @Type(type="text")
    @Column(name = "auto_description")
    private String autoDescription;

    @Column(name = "auto_rating")
    private Integer autoRating;

    public Auto() {
    }

    public Long getAutoId() {
        return autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getAutoPrice() {
        return autoPrice;
    }

    public void setAutoPrice(Double autoPrice) {
        this.autoPrice = autoPrice;
    }

    public String getAutoDescription() {
        return autoDescription;
    }

    public void setAutoDescription(String autoDescription) {
        this.autoDescription = autoDescription;
    }

    public Integer getAutoRating() {
        return autoRating;
    }

    public void setAutoRating(Integer autoRating) {
        this.autoRating = autoRating;
    }
}
