package com.example.demo.service;

import com.example.demo.domain.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.exception.SystemException;

import java.util.List;

/**
 * Created by doula_itc on 2017-06-07.
 */
public interface UserService {

    User save(User user) throws SystemException;

    List<User> findAll();

    User get(int id) throws NotFoundException;
}
