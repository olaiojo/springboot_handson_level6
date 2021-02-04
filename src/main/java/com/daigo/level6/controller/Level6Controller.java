package com.daigo.level6.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
@RequiredArgsConstructor
public class Level6Controller {

    @GetMapping("/index")
    public String index() {
        return "level6/index";
    }
}
