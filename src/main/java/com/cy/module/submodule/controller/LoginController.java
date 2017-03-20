package com.cy.module.submodule.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/18.
 */
@Controller
@RequestMapping("/loginController")
public class LoginController {

    @RequestMapping(value = "/login.do")
    public String login() {

        return "redirect:/studentController/showAllStudents.do?pageNum=1&pageSize=5";
    }


}
