package com.em.auto.service;

import com.em.auto.DTO.AutoDTO;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */

public interface AutoService {
    /**
     * method saves autoDto object
     *
     * @param autoDto
     * @return
     * @throws SQLDataException
     */
    AutoDTO save(AutoDTO autoDto) throws SQLDataException;

    /**
     * method returns list of all autoDto objects
     *
     * @return
     * @throws SQLDataException
     */
    List<AutoDTO> findAll() throws SQLDataException;

    /**
     * method returns autoDto object by autoDtoId
     *
     * @param autoDtoId
     * @return
     * @throws SQLDataException
     */
    AutoDTO findOne(Long autoDtoId) throws SQLDataException;
}
