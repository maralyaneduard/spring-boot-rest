package com.em.auto.controller;

import com.em.auto.DTO.UserDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@RestController
@RequestMapping("/users")
public interface UserController {

    /**
     * endPoint invokes userService for saving userDto object
     *
     * @param userDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDTO> save(@RequestBody UserDTO userDto);

    /**
     * endPoint invokes userService for getting list of all userDto objects
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<UserDTO>> findAll();

    /**
     * endPoint invokes userService for getting userDto by userDtoId
     *
     * @param userDtoId
     * @return
     */
    @RequestMapping(value = "/{modelDtoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDTO> findOne(@PathVariable(value = "userDtoId") Long userDtoId);

    /**
     * endPoint invokes userService for getting userDto by userName
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "/user-name/{userName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<UserDTO> findByUserName(@PathVariable(value = "userName") String userName);
}
