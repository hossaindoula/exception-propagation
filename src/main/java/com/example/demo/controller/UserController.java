package com.example.demo.controller;

import com.example.demo.domain.User;
import com.example.demo.exception.*;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController  {


    @Autowired
    @Qualifier("userServiceImpl")
    UserService userService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final Logger errorLogger = LoggerFactory.getLogger("ERROR");

    /************************ POST *********************************/
    /**
     * Used for all the Version API's
     *
     * @return response format
     */
    @RequestMapping(value = "/api/user",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Object> executeVersionApiWithPost(@RequestBody User user)
            throws BadRequestException,
            NotFoundException,
            SystemException,
            ServiceConditionException {
        return new ResponseEntity<>(userService.save(user), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/api/user/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE,
            method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Object> executeVersionApiWithGet(@PathVariable("id") int id)
            throws BadRequestException, NotFoundException, SystemException, ServiceConditionException, AuthorizationException {
        return new ResponseEntity<>(userService.get(id), HttpStatus.OK);
    }


}
