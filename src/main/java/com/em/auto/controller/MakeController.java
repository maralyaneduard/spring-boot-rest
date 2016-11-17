package com.em.auto.controller;

import com.em.auto.DTO.MakeDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@RestController
@RequestMapping("/makes")
public interface MakeController {

    /**
     * endPoint invokes makeService for saving makeDto object
     *
     * @param makeDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<MakeDTO> save(@RequestBody MakeDTO makeDto);

    /**
     * endPoint invokes makeService for getting list of all makeDto objects
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<MakeDTO>> findAll();

    /**
     * endPoint invokes makeService for getting makeDto by makeDtoId
     *
     * @param makeDtoId
     * @return
     */
    @RequestMapping(value = "/{makeDtoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<MakeDTO> findOne(@PathVariable(value = "makeDtoId") Long makeDtoId);

    /**
     * endPoint invokes makeService for getting makeDto by makeName
     *
     * @param makeName
     * @return
     */
    @RequestMapping(value = "/make-name/{makeName}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<MakeDTO> findByMakeName(@PathVariable(value = "makeName") String makeName);
}
