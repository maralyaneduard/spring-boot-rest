package com.em.auto.service;

import com.em.auto.DTO.AutoDTO;
import com.em.auto.DTO.ModelDTO;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
public interface ModelService {
    /**
     * method saves modelDto object
     *
     * @param modelDto
     * @return
     * @throws SQLDataException
     */
    ModelDTO save(ModelDTO modelDto) throws SQLDataException;

    /**
     * method returns list of all modelDto objects
     *
     * @return
     * @throws SQLDataException
     */
    List<ModelDTO> findAll() throws SQLDataException;

    /**
     * method returns modelDto object by modelDtoId
     *
     * @param modelDtoId
     * @return
     * @throws SQLDataException
     */
    ModelDTO findOne(Long modelDtoId) throws SQLDataException;

    /**
     * method returns modelDto object by modelName
     *
     * @param modelName
     * @return
     * @throws SQLDataException
     */
    ModelDTO findByModelName(String modelName) throws SQLDataException;
}
