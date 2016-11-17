package com.em.auto.controller;

import com.em.auto.DTO.CommentDTO;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@RestController
@RequestMapping("/comments")
public interface CommentController {

    /**
     * endPoint invokes commentService for saving commentDto object
     *
     * @param commentDto
     * @return
     */
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CommentDTO> save(@RequestBody CommentDTO commentDto);

    /**
     * endPoint invokes commentService for getting list of all commentDto objects
     *
     * @return
     */
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<List<CommentDTO>> findAll();

    /**
     * endPoint invokes commentService for getting commentDto by commentDtoId
     *
     * @param commentDtoId
     * @return
     */
    @RequestMapping(value = "/{commentDtoId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity<CommentDTO> findOne(@PathVariable(value = "commentDtoId") Long commentDtoId);
}
