package com.em.auto.controller;

import com.em.auto.DTO.AutoDTO;
import com.em.auto.DTO.MakeDTO;
import com.em.auto.DTO.ModelDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@RestController
@RequestMapping("/models")
public interface ModelController {

    /**
     * endPoint invokes modelService for saving modelDto object
     *
     * @param modelDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ModelDTO> save(@RequestBody ModelDTO modelDto);

    /**
     * endPoint invokes modelService for getting list of all modelDto objects
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<ModelDTO>> findAll();

    /**
     * endPoint invokes modelService for getting modelDto by modelDtoId
     *
     * @param modelDtoId
     * @return
     */
    @RequestMapping(value = "/{modelDtoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ModelDTO> findOne(@PathVariable(value = "modelDtoId") Long modelDtoId);

    /**
     * endPoint invokes modelService for getting modelDto by modelName
     *
     * @param modelName
     * @return
     */
    @RequestMapping(value = "/model-name/{modelName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<ModelDTO> findByModelName(@PathVariable(value = "modelName") String modelName);
}
