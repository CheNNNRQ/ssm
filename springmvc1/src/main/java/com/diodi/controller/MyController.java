package com.diodi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author diodi
 * @create 2021-03-29-20:45
 */
@Controller
public class MyController {
    @RequestMapping(value = "/some.do")
    public ModelAndView doSome(){
        ModelAndView mv = new ModelAndView();
        mv.addObject("msg", "huanyingshiyong ");
        mv.addObject("fun", "执行的是dosome方法");
        mv.setViewName("show");
        return mv;
    }
}
