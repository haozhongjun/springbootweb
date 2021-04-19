package com.example.springbootweb;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class TestController {

    @RequestMapping("/test")
    public ModelAndView TestDemo() {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("test","teste");
        return modelAndView;
    }
}
