package com.feiben.mybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.feiben.mybatis.entity.EasyUIResult;
import com.feiben.mybatis.service.UserService;

@RequestMapping("user")
@Controller
public class UserController {
	
      @Autowired
    private UserService userService;
      
    @RequestMapping(value="list",method=RequestMethod.GET)
    @ResponseBody//@responsebody表示该方法的返回结果直接写入HTTP response body中，直接返回json数据
    public EasyUIResult queryUserList(@RequestParam(value="page",defaultValue="1")Integer page,
            @RequestParam(value="rows",defaultValue="5")Integer rows){
        return this.userService.queryUserList(page,rows);
    }    
}