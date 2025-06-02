package com.apiFlying.ApiFlying.railway;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RailwayApis {


    @GetMapping("/getRailway")
    public String getRailway(){
        System.out.println("Testing Railway Success.....");
        return "Railway";
    }

}
