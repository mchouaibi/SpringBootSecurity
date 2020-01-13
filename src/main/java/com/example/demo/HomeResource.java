package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
    // specifies that the http request to be performed is Get on a path to a controller method specified in (...)
    @GetMapping("/")
    public String home() {
        return ("<h1>Welcome</h1>");
    }

    @GetMapping("/admin")
    public String admin() {
        return ("<h1>Welcome ADMIN</h1>");
    }

    @GetMapping("/user")
    public String user() {
        return ("<h1>Welcome USER</h1>");
    }
}
