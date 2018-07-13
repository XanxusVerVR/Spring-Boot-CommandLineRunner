package com.example.Runner;

import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

    @Autowired
    private ServletContext servletContext;

    @RequestMapping(value = "/", method = {RequestMethod.GET})
    @ResponseBody
    public String hello(String requestBody) {
        System.out.println(servletContext.getAttribute("name"));
        return "Hello Xanxus";
    }
}
