package com.em.auto.DTO;

import com.em.auto.entity.Auto;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by eduardm on 11/16/16.
 */
public class EngineDTO {

    private Long engineId;
    private Integer engineHp;
    private Double engineCc;
    private Set<AutoDTO> autos;

    public EngineDTO() {
    }
    public Long getEngineId() {
        return engineId;
    }
    public void setEngineId(Long engineId) {
        this.engineId = engineId;
    }
    public Integer getEngineHp() {
        return engineHp;
    }
    public void setEngineHp(Integer engineHp) {
        this.engineHp = engineHp;
    }
    public Double getEngineCc() {
        return engineCc;
    }
    public void setEngineCc(Double engineCc) {
        this.engineCc = engineCc;
    }

    public Set<AutoDTO> getAutos() {
        return autos;
    }

    public void setAutos(Set<AutoDTO> autos) {
        this.autos = autos;
    }
}
