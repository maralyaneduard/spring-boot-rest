package com.em.auto.entity;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by eduardm on 11/16/16.
 */
@Entity(name = "make")
public class Make {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "make_id")
    private Long makeId;

    @Column(name = "make_name", unique = true)
    private String makeName;

    @OneToMany(mappedBy = "make", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Model> models;

    @OneToMany(mappedBy = "make", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Auto> autos;

    public Make() {
    }

    public Long getMakeId() {
        return makeId;
    }

    public void setMakeId(Long makeId) {
        this.makeId = makeId;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public Set<Model> getModels() {
        return models;
    }

    public void setModels(Set<Model> models) {
        this.models = models;
    }

    public Set<Auto> getAutos() {
        return autos;
    }

    public void setAutos(Set<Auto> autos) {
        this.autos = autos;
    }
}
