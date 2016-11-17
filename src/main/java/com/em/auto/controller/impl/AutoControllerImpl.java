package com.em.auto.controller.impl;

import com.em.auto.DTO.AutoDTO;
import com.em.auto.controller.AutoController;
import com.em.auto.service.AutoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/17/16.
 */

@Component
public class AutoControllerImpl implements AutoController {

    private final static Logger LOGGER = LoggerFactory.getLogger(AutoController.class);
    @Autowired
    private AutoService autoService;


    @Override
    public ResponseEntity<AutoDTO> save(@RequestBody AutoDTO autoDto) {
        try {
            return new ResponseEntity<AutoDTO>(autoService.save(autoDto), HttpStatus.CREATED);
        } catch (SQLDataException ex) {
            LOGGER.error("[AutoControllerImpl][save] unable to save autoDto object", ex.getMessage());
            return new ResponseEntity<AutoDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<AutoDTO>> findAll() {
        try {
            List<AutoDTO> autos = autoService.findAll();
            if (autos != null && !autos.isEmpty()) {
                return new ResponseEntity<List<AutoDTO>>(autos, HttpStatus.OK);
            }
            return new ResponseEntity<List<AutoDTO>>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[AutoControllerImpl][findAll] unable to find all autoDtos", ex.getMessage());
            return new ResponseEntity<List<AutoDTO>>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<AutoDTO> findOne(@PathVariable(value = "autoDtoId") Long autoDtoId) {
        try {
            AutoDTO auto = autoService.findOne(autoDtoId);
            if (auto != null) {
                return new ResponseEntity<AutoDTO>(auto, HttpStatus.OK);
            }
            return new ResponseEntity<AutoDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[AutoControllerImpl][findOne] unable to find autoDto object by autoId : [{}]", autoDtoId, ex.getMessage());
            return new ResponseEntity<AutoDTO>(HttpStatus.NOT_FOUND);
        }
    }
}
