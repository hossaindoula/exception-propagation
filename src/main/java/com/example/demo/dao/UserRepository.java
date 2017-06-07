package com.example.demo.dao;

import com.example.demo.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by doula_itc on 2017-06-07.
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
