package com.wstutorial.oauth2.resourceserver;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {

    @GetMapping("/")
    public String whoami(@AuthenticationPrincipal Jwt jwt) {
        return String.format("Hello, %s", jwt.getClaim("preferred_username").toString());
    }

    @GetMapping("/protected")
    public String protectedHello() {
        return "Hello World, i was protected";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello World from admin";
    }
}
