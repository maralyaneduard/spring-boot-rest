package com.em.auto.controller.impl;

import com.em.auto.DTO.MakeDTO;
import com.em.auto.controller.MakeController;
import com.em.auto.service.MakeService;
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
public class MakeControllerImpl implements MakeController {

    private final static Logger LOGGER = LoggerFactory.getLogger(MakeController.class);
    @Autowired
    private MakeService makeService;


    @Override
    public ResponseEntity<MakeDTO> save(@RequestBody MakeDTO makeDto) {
        try {
            return new ResponseEntity<MakeDTO>(makeService.save(makeDto), HttpStatus.CREATED);
        } catch (SQLDataException ex) {
            LOGGER.error("[MakeControllerImpl][save] unable to save makeDto object", ex.getMessage());
            return new ResponseEntity<MakeDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<MakeDTO>> findAll() {
        try {
            List<MakeDTO> makes = makeService.findAll();
            if (makes != null && !makes.isEmpty()) {
                return new ResponseEntity<List<MakeDTO>>(makes, HttpStatus.OK);
            }
            return new ResponseEntity<List<MakeDTO>>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[MakeControllerImpl][findAll] unable to find all makeDtos", ex.getMessage());
            return new ResponseEntity<List<MakeDTO>>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<MakeDTO> findOne(@PathVariable(value = "makeDtoId") Long makeDtoId) {
        try {
            MakeDTO make = makeService.findOne(makeDtoId);
            if (make != null) {
                return new ResponseEntity<MakeDTO>(make, HttpStatus.OK);
            }
            return new ResponseEntity<MakeDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[MakeControllerImpl][findOne] unable to find makeDto object by makeId : [{}]", makeDtoId, ex.getMessage());
            return new ResponseEntity<MakeDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<MakeDTO> findByMakeName(@PathVariable(value = "makeName") String makeName) {
        try {
            MakeDTO make = makeService.findByMakeName(makeName);
            if (make != null) {
                return new ResponseEntity<MakeDTO>(make, HttpStatus.OK);
            }
            return new ResponseEntity<MakeDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[MakeControllerImpl][findByMakeName] unable to find makeDto by makeName : [{}]", makeName, ex.getMessage());
            return new ResponseEntity<MakeDTO>(HttpStatus.NOT_FOUND);
        }
    }
}
