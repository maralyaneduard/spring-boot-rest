package com.em.auto.service.impl;

import com.em.auto.DTO.AutoDTO;
import com.em.auto.converter.AutoConverter;
import com.em.auto.repository.AutoRepository;
import com.em.auto.service.AutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@Service
public class AutoServiceImpl implements AutoService {

    @Autowired
    private AutoRepository autoRepository;

    @Override
    public AutoDTO save(AutoDTO autoDto) throws SQLDataException {
        return AutoConverter.fromAuto(autoRepository.save(AutoConverter.fromAutoDto(autoDto)));
    }

    @Override
    public List<AutoDTO> findAll() throws SQLDataException {
        return AutoConverter.fromAutoList(autoRepository.findAll());
    }

    @Override
    public AutoDTO findOne(Long autoDtoId) throws SQLDataException {
        return AutoConverter.fromAuto(autoRepository.findOne(autoDtoId));
    }
}
