package com.lu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by lusai on 2016/6/10.
 */

@Controller
public class HemeController {
    @RequestMapping(value = "/")
    public String home(){
        return "test";
    }
}
