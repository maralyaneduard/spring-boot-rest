package com.em.auto.service.impl;

import com.em.auto.DTO.CommentDTO;
import com.em.auto.repository.CommentRepository;
import com.em.auto.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentRepository commentRepository;

    @Override
    public CommentDTO save(CommentDTO commentDto) throws SQLDataException {
        return null;
    }

    @Override
    public List<CommentDTO> findAll() throws SQLDataException {
        return null;
    }

    @Override
    public CommentDTO findOne(Long commentDtoId) throws SQLDataException {
        return null;
    }
}
