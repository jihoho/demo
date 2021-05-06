package com.example.demo.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA
 * User: hojun
 * Date: 2021-05-06 Time: 오후 8:42
 */
@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "hello!! welcome";
    }
}
