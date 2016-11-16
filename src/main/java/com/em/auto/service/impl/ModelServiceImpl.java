package com.em.auto.service.impl;

import com.em.auto.DTO.ModelDTO;
import com.em.auto.repository.ModelRepository;
import com.em.auto.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@Service
public class ModelServiceImpl implements ModelService {

    @Autowired
    private ModelRepository modelRepository;

    @Override
    public ModelDTO save(ModelDTO modelDto) throws SQLDataException {
        return null;
    }

    @Override
    public List<ModelDTO> findAll() throws SQLDataException {
        return null;
    }

    @Override
    public ModelDTO findOne(Long modelDtoId) throws SQLDataException {
        return null;
    }

    @Override
    public ModelDTO findByModelName(String modelName) throws SQLDataException {
        return null;
    }
}
