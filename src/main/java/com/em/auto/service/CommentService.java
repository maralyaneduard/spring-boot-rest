package com.em.auto.service;

import com.em.auto.DTO.CommentDTO;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
public interface CommentService {
    /**
     * method saves commentDto object
     *
     * @param commentDto
     * @return
     * @throws SQLDataException
     */
    CommentDTO save(CommentDTO commentDto) throws SQLDataException;

    /**
     * method returns list of all commentDto objects
     *
     * @return
     * @throws SQLDataException
     */
    List<CommentDTO> findAll() throws SQLDataException;

    /**
     * method returns commentDto object by commentDtoId
     *
     * @param commentDtoId
     * @return
     * @throws SQLDataException
     */
    CommentDTO findOne(Long commentDtoId) throws SQLDataException;
}
