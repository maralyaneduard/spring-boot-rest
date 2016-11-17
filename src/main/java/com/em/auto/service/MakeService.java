package com.em.auto.service;

import com.em.auto.DTO.MakeDTO;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
public interface MakeService {
    /**
     * method saves makeDto object
     *
     * @param makeDto
     * @return
     * @throws SQLDataException
     */
    MakeDTO save(MakeDTO makeDto) throws SQLDataException;

    /**
     * method returns list of all makeDto objects
     *
     * @return
     * @throws SQLDataException
     */
    List<MakeDTO> findAll() throws SQLDataException;

    /**
     * method returns makeDto object by makeDtoId
     *
     * @param makeDtoId
     * @return
     * @throws SQLDataException
     */
    MakeDTO findOne(Long makeDtoId) throws SQLDataException;

    /**
     * method returns makeDto object by makeName
     *
     * @param makeName
     * @return
     * @throws SQLDataException
     */
    MakeDTO findByMakeName(String makeName) throws SQLDataException;
}
