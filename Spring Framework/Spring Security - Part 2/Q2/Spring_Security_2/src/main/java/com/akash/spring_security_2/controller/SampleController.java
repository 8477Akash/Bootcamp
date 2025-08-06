package com.akash.spring_security_2.controller;
import com.akash.spring_security_2.security.CustomUserPrincipal;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/api")
public class SampleController {

    @GetMapping("/user/info")
    public String userAccess(OAuth2AuthenticationToken token) {
        CustomUserPrincipal user = (CustomUserPrincipal) token.getPrincipal();
        return "Hello USER: " + user.getEmail();
    }

    @GetMapping("/admin/dashboard")
    public String adminAccess(OAuth2AuthenticationToken token) {
        CustomUserPrincipal user = (CustomUserPrincipal) token.getPrincipal();
        return "Hello ADMIN: " + user.getEmail();
    }
}
