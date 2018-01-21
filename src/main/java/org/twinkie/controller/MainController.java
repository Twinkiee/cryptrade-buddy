package org.twinkie.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String main(){
        return "main";
    }

    @ResponseBody
    @RequestMapping(value="/greeting",method = RequestMethod.GET)
    public String greeting(){
        return "Message From SpringBoot Service - Hello World!";
    }

    @RequestMapping(value="/dashboard",method = RequestMethod.GET)
    public String dashboard(){
        return "index";
    }
}
