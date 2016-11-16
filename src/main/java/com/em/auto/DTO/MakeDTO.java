package com.em.auto.DTO;

import java.util.Set;

/**
 * Created by eduardm on 11/16/16.
 */
public class MakeDTO {

    private Long makeId;
    private String makeName;
    private Set<ModelDTO> models;
    private Set<AutoDTO> autos;

    public MakeDTO() {
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

    public Set<ModelDTO> getModels() {
        return models;
    }

    public void setModels(Set<ModelDTO> models) {
        this.models = models;
    }

    public Set<AutoDTO> getAutos() {
        return autos;
    }

    public void setAutos(Set<AutoDTO> autos) {
        this.autos = autos;
    }
}
