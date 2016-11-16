package com.em.auto.DTO;

/**
 * Created by eduardm on 11/16/16.
 */
public class AutoDTO {

    private Long autoId;
    private ModelDTO modelDto;
    private EngineDTO engineDto;
    private UserDTO userDto;
    private Double autoPrice;
    private String autoDescription;
    private Integer autoRating;

    public AutoDTO() {
    }

    public Long getAutoId() {
        return autoId;
    }

    public void setAutoId(Long autoId) {
        this.autoId = autoId;
    }

    public ModelDTO getModelDto() {
        return modelDto;
    }

    public void setModelDto(ModelDTO modelDto) {
        this.modelDto = modelDto;
    }

    public EngineDTO getEngineDto() {
        return engineDto;
    }

    public void setEngineDto(EngineDTO engineDto) {
        this.engineDto = engineDto;
    }

    public UserDTO getUserDto() {
        return userDto;
    }

    public void setUserDto(UserDTO userDto) {
        this.userDto = userDto;
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
