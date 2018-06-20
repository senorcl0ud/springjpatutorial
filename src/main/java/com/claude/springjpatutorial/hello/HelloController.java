package com.claude.springjpatutorial.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

    //when a request is made at this endpoint, the following method is called.
    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello.";
    }
}
