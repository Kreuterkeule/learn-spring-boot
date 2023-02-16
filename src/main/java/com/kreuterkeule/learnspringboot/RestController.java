package com.kreuterkeule.learnspringboot;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController public class RestController {

    @GetMapping("/") public String getROOT() {
        return "Welcome to api ROOT / + test intellij push";
    }
}
