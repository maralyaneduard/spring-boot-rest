package com.em.auto.service.impl;

import com.em.auto.DTO.EngineDTO;
import com.em.auto.repository.EngineRepositpry;
import com.em.auto.service.EngineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@Service
public class EngineServiceImpl implements EngineService{

    @Autowired
    private EngineRepositpry engineRepositpry;

    @Override
    public EngineDTO save(EngineDTO engineDto) throws SQLDataException {
        return null;
    }

    @Override
    public List<EngineDTO> findAll() throws SQLDataException {
        return null;
    }

    @Override
    public EngineDTO findOne(Long engineDtoId) throws SQLDataException {
        return null;
    }

    @Override
    public EngineDTO findByHp(Integer engineHp) throws SQLDataException {
        return null;
    }

    @Override
    public EngineDTO findByCC(Double engineCc) throws SQLDataException {
        return null;
    }
}
