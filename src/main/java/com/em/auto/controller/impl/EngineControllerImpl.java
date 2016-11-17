package com.em.auto.controller.impl;

import com.em.auto.DTO.EngineDTO;
import com.em.auto.controller.EngineController;
import com.em.auto.service.EngineService;
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
public class EngineControllerImpl implements EngineController {

    private final static Logger LOGGER = LoggerFactory.getLogger(EngineController.class);
    @Autowired
    private EngineService engineService;

    @Override
    public ResponseEntity<EngineDTO> save(@RequestBody EngineDTO engineDto) {
        try {
            return new ResponseEntity<EngineDTO>(engineService.save(engineDto), HttpStatus.CREATED);
        } catch (SQLDataException ex) {
            LOGGER.error("[EngineControllerImpl][save] unable to save engineDto object", ex.getMessage());
            return new ResponseEntity<EngineDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<EngineDTO>> findAll() {
        try {
            List<EngineDTO> engines = engineService.findAll();
            if (engines != null && !engines.isEmpty()) {
                return new ResponseEntity<List<EngineDTO>>(engines, HttpStatus.OK);
            }
            return new ResponseEntity<List<EngineDTO>>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[EngineControllerImpl][findAll] unable to find all engineDtos", ex.getMessage());
            return new ResponseEntity<List<EngineDTO>>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<EngineDTO> findOne(@PathVariable(value = "engineDtoId") Long engineDtoId) {
        try {
            EngineDTO engine = engineService.findOne(engineDtoId);
            if (engine != null) {
                return new ResponseEntity<EngineDTO>(engine, HttpStatus.OK);
            }
            return new ResponseEntity<EngineDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[EngineControllerImpl][findOne] unable to find engineDto object by engineId : [{}]", engineDtoId, ex.getMessage());
            return new ResponseEntity<EngineDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<EngineDTO> findByEngineCc(@PathVariable(value = "engineCc") Double engineCc) {
        try {
            EngineDTO engine = engineService.findByCC(engineCc);
            if (engine != null) {
                return new ResponseEntity<EngineDTO>(engine, HttpStatus.OK);
            }
            return new ResponseEntity<EngineDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[EngineControllerImpl][findByEngineCc] unable to find engineDto by engineCc : [{}]", engineCc, ex.getMessage());
            return new ResponseEntity<EngineDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<EngineDTO> findByEngineHp(@PathVariable(value = "engineHp") Integer engineHp) {
        try {
            EngineDTO engine = engineService.findByHp(engineHp);
            if (engine != null) {
                return new ResponseEntity<EngineDTO>(engine, HttpStatus.OK);
            }
            return new ResponseEntity<EngineDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[EngineControllerImpl][findByEngineHp] unable to find engineDto by engineCc : [{}]", engineHp, ex.getMessage());
            return new ResponseEntity<EngineDTO>(HttpStatus.NOT_FOUND);
        }
    }
}
