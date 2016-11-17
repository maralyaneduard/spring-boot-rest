package com.em.auto.DTO;

/**
 * Created by eduardm on 11/16/16.
 */
public class AutoDTO {

    private Long autoId;
    private ModelDTO model;
    private EngineDTO engine;
    private UserDTO user;
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

    public ModelDTO getModel() {
        return model;
    }

    public void setModel(ModelDTO model) {
        this.model = model;
    }

    public EngineDTO getEngine() {
        return engine;
    }

    public void setEngine(EngineDTO engine) {
        this.engine = engine;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
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
