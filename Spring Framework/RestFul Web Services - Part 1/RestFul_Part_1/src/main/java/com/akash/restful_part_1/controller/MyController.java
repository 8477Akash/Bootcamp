package com.akash.restful_part_1.controller;


import com.akash.restful_part_1.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/rest")
public class MyController {

    @Autowired
  private MyService myService;

    @GetMapping("/welcome")
    public String welcome() {
      return   myService.welcome();
    }
}
