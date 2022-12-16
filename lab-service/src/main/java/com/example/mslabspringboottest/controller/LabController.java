package com.example.mslabspringboottest.controller;

import com.example.mslabspringboottest.model.LabSystem;
import com.example.mslabspringboottest.service.LabService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class LabController {
    private final LabService service;

    public LabController(LabService service) {
        this.service = service;
    }
    @GetMapping("/checkConnection")
    public String check(){
        return "Connected";
    }
    @PostMapping("/addSystem")
    public LabSystem addSystem(@RequestBody LabSystem system){
        return service.create(system);
    }

    @PutMapping("/update/{id}")
    public LabSystem update(@RequestBody LabSystem system,@PathVariable String id){
        return service.update(system,id);
    }

    @DeleteMapping("/deleteAll")
    public String deleteAll(){
        service.deleteAll();
        return "Deleted all Systems";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteSystem(@PathVariable String id){
        service.deleteSystem(id);
        return "Deleted System : "+id;
    }
}
