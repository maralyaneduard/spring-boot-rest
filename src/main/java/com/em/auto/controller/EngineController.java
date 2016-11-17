package com.em.auto.controller;

import com.em.auto.DTO.AutoDTO;
import com.em.auto.DTO.EngineDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@RestController
@RequestMapping("/engines")
public interface EngineController {

    /**
     * endPoint invokes engineService for saving engineDto object
     *
     * @param engineDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<EngineDTO> save(@RequestBody EngineDTO engineDto);

    /**
     * endPoint invokes engineService for getting list of all engineDto objects
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<EngineDTO>> findAll();

    /**
     * endPoint invokes engineService for getting engineDto by engineDtoId
     *
     * @param engineDtoId
     * @return
     */
    @RequestMapping(value = "/{engineDtoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<EngineDTO> findOne(@PathVariable(value = "engineDtoId") Long engineDtoId);

    /**
     * endPoint invokes engineService for getting engineDto by engineCc
     *
     * @param engineCc
     * @return
     */
    @RequestMapping(value = "/engine-cc/{engineCc}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<EngineDTO> findByEngineCc(@PathVariable(value = "engineCc") Double engineCc);

    /**
     * endPoint invokes engineService for getting engineDto by engineHp
     *
     * @param engineHp
     * @return
     */
    @RequestMapping(value = "/engine-hp/{engineHp}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<EngineDTO> findByEngineHp(@PathVariable(value = "engineHp") Integer engineHp);
}
