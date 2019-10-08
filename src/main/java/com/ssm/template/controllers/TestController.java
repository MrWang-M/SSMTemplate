package com.ssm.template.controllers;

import com.ssm.template.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Controller
public class TestController {
    @Autowired
    private TestService testService;

    @RequestMapping("getUser.do")
    public void getUser(String userId){
        System.out.println(testService.getUser(userId));
    }
}
