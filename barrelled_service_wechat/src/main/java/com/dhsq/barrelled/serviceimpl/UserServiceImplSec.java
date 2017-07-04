package com.dhsq.barrelled.serviceimpl;

import com.dhsq.barrelled.dao.UserMapper;
import com.dhsq.barrelled.dao.UserMapperSec;
import com.dhsq.barrelled.model.User;
import com.dhsq.barrelled.service.UserService;
import com.dhsq.barrelled.service.UserServiceSec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * Created by jerry on 2017/7/2.
 */
@Service
public class UserServiceImplSec implements UserServiceSec {
    @Autowired(required = false)
    private UserMapperSec userMapper;


    @Override
    public int insertUser(User user) {
        return userMapper.insertUser(user);
    }

}
