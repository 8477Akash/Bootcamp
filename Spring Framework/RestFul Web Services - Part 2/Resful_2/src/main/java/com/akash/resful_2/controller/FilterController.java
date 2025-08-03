package com.akash.resful_2.controller;

import com.akash.resful_2.model.UserEntity;
import com.akash.resful_2.model.UserEntity2;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/filter")
public class FilterController {


    @PostMapping("/users")
    public UserEntity createUser(@RequestBody UserEntity user) {
        return user;
    }

    @PostMapping("/dynamic/users")
    public MappingJacksonValue createDynamicUser(@RequestBody UserEntity2 user) {
        MappingJacksonValue mappingJacksonValue = new MappingJacksonValue(user);

        SimpleBeanPropertyFilter propertyFilter = SimpleBeanPropertyFilter.filterOutAllExcept("name", "email");
        FilterProvider filterProvider = new SimpleFilterProvider().addFilter("userFilter", propertyFilter);
        mappingJacksonValue.setFilters(filterProvider);
        return mappingJacksonValue;
    }
}
