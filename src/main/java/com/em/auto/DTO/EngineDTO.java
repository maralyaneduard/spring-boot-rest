package com.em.auto.DTO;

import com.em.auto.entity.Auto;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by eduardm on 11/16/16.
 */
@Entity(name = "engine")
public class EngineDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "engine_id")
    private Long engineId;

    @Column(name = "engine_hp")
    private Integer engineHp;

    @Column(name = "engine_cc")
    private Double engineCc;

    @OneToMany(mappedBy = "engine", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Auto> autos;

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
}
