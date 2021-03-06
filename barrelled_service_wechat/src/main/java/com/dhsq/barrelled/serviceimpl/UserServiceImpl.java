package com.dhsq.barrelled.serviceimpl;

import com.dhsq.barrelled.dao.UserMapper;
import com.dhsq.barrelled.model.User;
import com.dhsq.barrelled.service.UserService;
import com.dhsq.barrelled.service.UserServiceSec;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

import static com.sun.xml.internal.ws.api.model.wsdl.WSDLBoundOperation.ANONYMOUS.required;


/**
 * Created by jerry on 2017/7/2.
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
   public List<User> getAll(){
        return userMapper.getAllUser();
    }

    @Override
    public int editUser(User user) throws Exception{
        return userMapper.editUser(user);
    }
}
