package com.example.demo1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/show/{name}")
    public String show(@PathVariable String name){
        ModelAndView mv = new ModelAndView();
        mv.addObject(name);
        return "show";
    }
}
