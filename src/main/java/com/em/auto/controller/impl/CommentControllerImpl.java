package com.em.auto.controller.impl;

import com.em.auto.DTO.CommentDTO;
import com.em.auto.controller.CommentController;
import com.em.auto.service.CommentService;
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
public class CommentControllerImpl implements CommentController {
    private final static Logger LOGGER = LoggerFactory.getLogger(CommentController.class);
    @Autowired
    private CommentService commentService;

    @Override
    public ResponseEntity<CommentDTO> save(@RequestBody CommentDTO commentDto) {
        try {
            return new ResponseEntity<CommentDTO>(commentService.save(commentDto), HttpStatus.CREATED);
        } catch (SQLDataException ex) {
            LOGGER.error("[CommentControllerImpl][save] unable to save commentDto object", ex.getMessage());
            return new ResponseEntity<CommentDTO>(HttpStatus.BAD_REQUEST);
        }
    }

    @Override
    public ResponseEntity<List<CommentDTO>> findAll() {
        try {
            List<CommentDTO> comments = commentService.findAll();
            if (comments != null && !comments.isEmpty()) {
                return new ResponseEntity<List<CommentDTO>>(comments, HttpStatus.OK);
            }
            return new ResponseEntity<List<CommentDTO>>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[CommentControllerImpl][findAll] unable to find all commentDto", ex.getMessage());
            return new ResponseEntity<List<CommentDTO>>(HttpStatus.NOT_FOUND);
        }
    }

    @Override
    public ResponseEntity<CommentDTO> findOne(@PathVariable(value = "commentDtoId") Long commentDtoId) {
        try {
            CommentDTO comment = commentService.findOne(commentDtoId);
            if (comment != null) {
                return new ResponseEntity<CommentDTO>(comment, HttpStatus.OK);
            }
            return new ResponseEntity<CommentDTO>(HttpStatus.NOT_FOUND);
        } catch (SQLDataException ex) {
            LOGGER.error("[CommentControllerImpl][findOne] unable to find commentDto object by commentId : [{}]", commentDtoId, ex.getMessage());
            return new ResponseEntity<CommentDTO>(HttpStatus.NOT_FOUND);
        }
    }
}
