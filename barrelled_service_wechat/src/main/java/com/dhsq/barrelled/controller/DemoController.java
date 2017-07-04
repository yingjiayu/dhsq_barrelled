package com.dhsq.barrelled.controller;

import com.dhsq.barrelled.model.User;
import com.dhsq.barrelled.service.UserService;
import com.dhsq.common.utils.CommonUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import redis.clients.jedis.JedisPool;

import java.util.HashMap;
import java.util.List;


/**
 * Created by jerry on 2017/6/27.
 */
@Controller
public class DemoController {
    @Autowired
    UserService userService;
    @Autowired
    private JedisPool jedisPool;
    private static Logger logger = LogManager.getLogger(DemoController.class.getName());
    @ResponseBody
    @RequestMapping("first")
    public Object first() throws Exception{
        CommonUtil.chengeCase("asd");
        logger.debug("debug");
        logger.error("error");
        logger.info("info");
        logger.warn("warn");
        HashMap<String,Object> result = new HashMap<>();
        result.put("key","中文！");
        List<User> users=userService.getAll();
        result.put("name", jedisPool.getResource().get("name"));
        result.put("更新条数",userService.editUser(new User(1,"edit")));
        result.put("新增条数",userService.editUser(new User(2,"xinzeng")));
        for(User user : users){
            result.put(user.getId().toString(),user.getName());
        }
        return result;
    }
}
