package com.em.auto.DTO;

/**
 * Created by eduardm on 11/16/16.
 */
public class ModelDTO {

    private Long modelId;
    private String modelName;
    private MakeDTO makeDto;

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
        return makeDto;
    }

    public void setMake(MakeDTO makeDto) {
        this.makeDto = makeDto;
    }
}

