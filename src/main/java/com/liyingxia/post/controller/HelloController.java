package com.liyingxia.post.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Package: com.liyingxia.post.controller
 * @Description:
 * @Author: liyingxia
 * @CreateDate: 2021/11/15 10:03
 */

@RestController
public class HelloController {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "Hello Spring Boot!";
    }

}
