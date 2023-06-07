package com.assignment.hospitalappointment.controller;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/v1/test")
public class TestingController {
    @GetMapping()
    public String test(){
        return  "hello";
    }
}
