package com.em.auto.controller;

import com.em.auto.DTO.AutoDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@RestController
@RequestMapping("/autos")
public interface AutoController {

    /**
     * endPoint invokes autoService for saving autoDto object
     *
     * @param autoDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AutoDTO> save(@RequestBody AutoDTO autoDto);

    /**
     * endPoint invokes autoService for getting list of all autoDto objects
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<AutoDTO>> findAll();

    /**
     * endPoint invokes autoService for getting autoDto by autoDtoId
     *
     * @param autoDtoId
     * @return
     */
    @RequestMapping(value = "/{autoDtoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<AutoDTO> findOne(@PathVariable(value = "autoDtoId") Long autoDtoId);
}
