package com.dfz.test.controller;

import com.dfz.test.entity.Sex;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {

    @RequestMapping("enums")
    private Sex[] getEnums() {
        return Sex.values();
    }

}
