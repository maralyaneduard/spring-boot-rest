package com.em.auto.DTO;

import javax.persistence.*;

/**
 * Created by eduardm on 11/16/16.
 */
@Entity(name = "model")
public class ModelDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "model_id")
    private Long modelId;

    @Column(name = "model_name", unique = true)
    private String modelName;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "make_id")
    private MakeDTO make;

    public ModelDTO() {
    }

    public Long getModelId() {
        return modelId;
    }

    public void setModelId(Long modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public MakeDTO getMake() {
        return make;
    }

    public void setMake(MakeDTO make) {
        this.make = make;
    }
}

