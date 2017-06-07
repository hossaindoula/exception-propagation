package com.example.demo.service.impl;

import com.example.demo.dao.UserRepository;
import com.example.demo.domain.User;
import com.example.demo.exception.NotFoundException;
import com.example.demo.exception.SystemException;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by doula_itc on 2017-06-07.
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public User save(User user) throws SystemException{
        try{

            return userRepository.save(user);
        } catch (Exception ex){
            throw new SystemException("User is not saved");
        }
    }

    public List<User> findAll(){
        return (List<User>) userRepository.findAll();
    }

    public User get(int id) throws NotFoundException{
        User user = userRepository.findOne(id);
        if(user == null)
            throw new NotFoundException("The user not found " + id);

        return user;
    }
}
