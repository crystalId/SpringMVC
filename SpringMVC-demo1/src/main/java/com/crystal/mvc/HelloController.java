package com.crystal.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author crystal
 * @create 2023-02-15 17:37
 */
@Controller
public class HelloController {

    @RequestMapping(value = "/")
    public String index(){
        return "index";
    }
}
