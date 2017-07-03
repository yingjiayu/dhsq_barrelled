package com.dhsq.barrelled.controller;

import com.dhsq.barrelled.model.User;
import com.dhsq.barrelled.service.UserService;
import com.dhsq.common.utils.CommonUtil;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.soap.Addressing;
import java.util.HashMap;
import java.util.List;


/**
 * Created by jerry on 2017/6/27.
 */
@Controller
public class DemoController {
    @Autowired
    UserService userService;
    private static Logger logger = LogManager.getLogger(DemoController.class.getName());
    @ResponseBody
    @RequestMapping("first")
    public Object first(){
        CommonUtil.chengeCase("asd");
        logger.debug("日志打印");
        logger.error("日志打印");
        logger.info("日志打印");
        logger.warn("日志打印");
        HashMap<String,Object> result = new HashMap<>();
        result.put("key","中文！");
        List<User> users=userService.getAll();
        for(User user : users){
            result.put(user.getId().toString(),user.getName());
        }
        return result;
    }
}
