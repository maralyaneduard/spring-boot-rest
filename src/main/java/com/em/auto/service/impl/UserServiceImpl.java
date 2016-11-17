package com.em.auto.service.impl;

import com.em.auto.DTO.UserDTO;
import com.em.auto.repository.UserRepository;
import com.em.auto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO save(UserDTO userDto) throws SQLDataException {
        return null;
    }

    @Override
    public List<UserDTO> findAll() throws SQLDataException {
        return null;
    }

    @Override
    public UserDTO findOne(Long userDtoId) throws SQLDataException {
        return null;
    }

    @Override
    public UserDTO findByUserName(String userName) throws SQLDataException {
        return null;
    }
}
