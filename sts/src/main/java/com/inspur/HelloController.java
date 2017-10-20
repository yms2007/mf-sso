package com.inspur;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by yangmingsheng on 2017/10/20.
 */
@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(HttpServletRequest response) {
        return "/helloworld";
    }
    @GetMapping("/hello/default")
    public void helloDefault(HttpServletResponse response) {
        try {
            response.sendRedirect("/hello/xiaoming112233445566");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @GetMapping("/hello/{name}")
    public String helloName(@PathVariable String name){
        return "hello"+name;
    }
}
