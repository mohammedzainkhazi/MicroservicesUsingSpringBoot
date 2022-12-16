package com.example.mslabspringboottest.controller;

import com.example.mslabspringboottest.model.LabSystem;
import com.example.mslabspringboottest.service.LabService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/get")
public class LabController {
    private final LabService service;

    public LabController(LabService service) {
        this.service = service;
    }
    @GetMapping("/checkConnection")
    public String check(){
        return "Connected";
    }
    @GetMapping("/all")
    public List<LabSystem> getAll(){
        return service.getAll();
    }

    @GetMapping("/{id}")
    public LabSystem getSystem(@PathVariable String id){
        return service.getSystem(id);
    }
}
