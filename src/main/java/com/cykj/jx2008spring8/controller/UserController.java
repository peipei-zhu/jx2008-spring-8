package com.cykj.jx2008spring8.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

@Controller
public class UserController {

    @RequestMapping("index")
    public ModelAndView index(){
        ModelAndView modelAndView =new ModelAndView("index");
        modelAndView.addObject("time",new Date());
        modelAndView.getModel().put("name","小白");

        return modelAndView;
    }
}
