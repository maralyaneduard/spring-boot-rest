package com.em.auto.service;

import com.em.auto.DTO.EngineDTO;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
public interface EngineService {
    /**
     * method saves engineDto object
     *
     * @param engineDto
     * @return
     * @throws SQLDataException
     */
    EngineDTO save(EngineDTO engineDto) throws SQLDataException;

    /**
     * method returns list of all engineDto objects
     *
     * @return
     * @throws SQLDataException
     */
    List<EngineDTO> findAll() throws SQLDataException;

    /**
     * method returns engineDto object by engineDtoId
     *
     * @param engineDtoId
     * @return
     * @throws SQLDataException
     */
    EngineDTO findOne(Long engineDtoId) throws SQLDataException;

    /**
     * method returns engineDto object by engineHp
     *
     * @param engineHp
     * @return
     * @throws SQLDataException
     */
    EngineDTO findByHp(Integer engineHp) throws SQLDataException;

    /**
     * method returns engineDto object by engineCc
     *
     * @param engineCc
     * @return
     * @throws SQLDataException
     */
    EngineDTO findByCC(Double engineCc) throws SQLDataException;
}
