package com.xiaodao.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiaodao
 * @description
 * @since 2018/12/22
 **/
@RestController
public class FallbackController {


    @RequestMapping(value = "/fallback", method = RequestMethod.GET)
    public String fallback() {
        return "faill";
    }
}
