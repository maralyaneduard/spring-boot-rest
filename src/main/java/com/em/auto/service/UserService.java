package com.em.auto.service;

import com.em.auto.DTO.UserDTO;

import java.sql.SQLDataException;
import java.util.List;

/**
 * Created by eduardm on 11/16/16.
 */
public interface UserService {
    /**
     * method saves userDto object
     *
     * @param userDto
     * @return
     * @throws SQLDataException
     */
    UserDTO save(UserDTO userDto) throws SQLDataException;

    /**
     * method returns list of all userDto objects
     *
     * @return
     * @throws SQLDataException
     */
    List<UserDTO> findAll() throws SQLDataException;

    /**
     * method returns userDto object by userDtoId
     *
     * @param userDtoId
     * @return
     * @throws SQLDataException
     */
    UserDTO findOne(Long userDtoId) throws SQLDataException;

    /**
     * method returns userDto object by userName
     *
     * @param userName
     * @return
     * @throws SQLDataException
     */
    UserDTO findByUserName(String userName) throws SQLDataException;
}
