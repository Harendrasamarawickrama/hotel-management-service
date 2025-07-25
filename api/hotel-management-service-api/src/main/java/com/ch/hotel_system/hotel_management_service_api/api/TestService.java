package com.ch.hotel_system.hotel_management_service_api.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hotel-management/api/v1/test")
public class TestService {
    @GetMapping("/check")
    public String Test(){
        return "Connected !";
    }
}

//http://localhost:8082/hotel-management/api/v1/test/check

