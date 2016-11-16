package com.em.auto.service.impl;

import com.em.auto.DTO.MakeDTO;
import com.em.auto.repository.MakeRepository;
import com.em.auto.service.MakeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@Service
public class MakeServiceImpl implements MakeService {

    @Autowired
    private MakeRepository makeRepository;

    @Override
    public MakeDTO save(MakeDTO makeDto) throws SQLDataException {
        return null;
    }

    @Override
    public List<MakeDTO> findAll() throws SQLDataException {
        return null;
    }

    @Override
    public MakeDTO findOne(Long makeDtoId) throws SQLDataException {
        return null;
    }

    @Override
    public MakeDTO findByMakeName(String makeName) throws SQLDataException {
        return null;
    }
}
