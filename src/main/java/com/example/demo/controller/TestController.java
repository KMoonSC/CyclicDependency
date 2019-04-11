package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author xuyyuan
 * @Date 2019-03-26 16:25
 **/

@RestController
public class TestController {

    @PostMapping("123")
    public String testRequstBody(@RequestBody String param) {
        return param;
    }
}
