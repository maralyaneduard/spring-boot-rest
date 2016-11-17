package com.em.auto.controller.impl;

import com.em.auto.DTO.MakeDTO;
import com.em.auto.DTO.ModelDTO;
import com.em.auto.controller.MakeController;
import com.em.auto.controller.ModelController;
import com.em.auto.service.ModelService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/17/16.
 */
public class ModelControllerImpl implements ModelController {
    private final static Logger LOGGER = LoggerFactory.getLogger(MakeController.class);
    @Autowired
    private ModelService modelService;

    @Override
    public ResponseEntity<ModelDTO> save(@RequestBody ModelDTO modelDto) {
        try {
            return new ResponseEntity<ModelDTO>(modelService.save(modelDto), HttpStatus.CREATED);
        } catch (SQLDataException ex) {
            LOGGER.error("[ModelControllerImpl][save] unable to save modelDto object", ex.getMessage());
            return new ResponseEntity<ModelDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<ModelDTO>> findAll() {
        try {
            List<ModelDTO> models = modelService.findAll();
            if (models != null && !models.isEmpty()) {
                return new ResponseEntity<List<ModelDTO>>(models, HttpStatus.OK);
            }
            return new ResponseEntity<List<ModelDTO>>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[ModelControllerImpl][findAll] unable to find all modelDtos", ex.getMessage());
            return new ResponseEntity<List<ModelDTO>>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<ModelDTO> findOne(@PathVariable(value = "modelDtoId") Long modelDtoId) {
        try {
            ModelDTO make = modelService.findOne(modelDtoId);
            if (make != null) {
                return new ResponseEntity<ModelDTO>(make, HttpStatus.OK);
            }
            return new ResponseEntity<ModelDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[ModelControllerImpl][findOne] unable to find modelDto object by modelId : [{}]", modelDtoId, ex.getMessage());
            return new ResponseEntity<ModelDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<ModelDTO> findByModelName(@PathVariable(value = "modelName") String modelName) {
        try {
            ModelDTO model = modelService.findByModelName(modelName);
            if (model != null) {
                return new ResponseEntity<ModelDTO>(model, HttpStatus.OK);
            }
            return new ResponseEntity<ModelDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[ModelControllerImpl][findByModelName] unable to find modelDto by modelName : [{}]", modelName, ex.getMessage());
            return new ResponseEntity<ModelDTO>(HttpStatus.NOT_FOUND);
        }
    }
}
