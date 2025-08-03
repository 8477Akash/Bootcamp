package com.akash.resful_2.controller;


import com.akash.resful_2.model.UserV1;
import com.akash.resful_2.model.UserV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VersionController {

    //MIME
    @GetMapping(value = "/users",produces = "application/vnd.company.app-v1+json")
    public UserV1 getUsers() {
        return new UserV1("Akash-v1",23);
    }

    @GetMapping(value = "/users", produces = "application/vnd.company.app-v2+json")
    public UserV2 getUsers2() {
        return new UserV2("Akash","Kumar",23);
    }
    //Req-Params
    @GetMapping(value = "/users", params = "version=1")
    public UserV1 getUserParamV1() { return new UserV1("Akash",23); }

    @GetMapping(value = "/users", params = "version=2")
    public UserV2 getUserParamV2() { return new UserV2("Akash","Kumar",23); }

    //Url

    @GetMapping(value = "/v1/users")
    public UserV1 getUserUrlV1() { return new UserV1("Akash-url",23); }

    @GetMapping(value = "/v2/users")
    public UserV2 getUserUrlV2() { return new UserV2("Akash-url","Kumar",23); }

    //headers
    @GetMapping(value = "/users",headers = "API-VERSION=1")
    public UserV1 getUserHeaderV1() { return new UserV1("Akash-header",23); }

    @GetMapping(value = "/users",headers = "API-VERSION=2")
    public UserV2 getUserHeaderV2() { return new UserV2("Akash-header","Kumar",23); }



}
