package com.em.auto.controller.impl;

import com.em.auto.DTO.UserDTO;
import com.em.auto.controller.MakeController;
import com.em.auto.controller.UserController;
import com.em.auto.service.UserService;
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
public class UserControllerImpl implements UserController {
    private final static Logger LOGGER = LoggerFactory.getLogger(MakeController.class);
    @Autowired
    private UserService userService;

    @Override
    public ResponseEntity<UserDTO> save(@RequestBody UserDTO userDto) {
        try {
            return new ResponseEntity<UserDTO>(userService.save(userDto), HttpStatus.CREATED);
        } catch (SQLDataException ex) {
            LOGGER.error("[UserControllerImpl][save] unable to save userDto object", ex.getMessage());
            return new ResponseEntity<UserDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<UserDTO>> findAll() {
        try {
            List<UserDTO> users = userService.findAll();
            if (users != null && !users.isEmpty()) {
                return new ResponseEntity<List<UserDTO>>(users, HttpStatus.OK);
            }
            return new ResponseEntity<List<UserDTO>>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[UserControllerImpl][findAll] unable to find all userDtos", ex.getMessage());
            return new ResponseEntity<List<UserDTO>>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<UserDTO> findOne(@PathVariable(value = "userDtoId") Long userDtoId) {
        try {
            UserDTO user = userService.findOne(userDtoId);
            if (user != null) {
                return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
            }
            return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[UserControllerImpl][findOne] unable to find userDto object by userId : [{}]", userDtoId, ex.getMessage());
            return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<UserDTO> findByUserName(@PathVariable(value = "userName") String userName) {
        try {
            UserDTO user = userService.findByUserName(userName);
            if (user != null) {
                return new ResponseEntity<UserDTO>(user, HttpStatus.OK);
            }
            return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[UserControllerImpl][findByUserName] unable to find userDto by userName : [{}]", userName, ex.getMessage());
            return new ResponseEntity<UserDTO>(HttpStatus.NOT_FOUND);
        }
    }
}
