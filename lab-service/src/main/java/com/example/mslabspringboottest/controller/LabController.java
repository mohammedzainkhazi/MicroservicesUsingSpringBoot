package com.example.mslabspringboottest.controller;

import com.example.mslabspringboottest.model.LabSystem;
import com.example.mslabspringboottest.service.LabService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;


import java.util.List;

@RestController
@RequestMapping("/api")
public class LabController {
    @Autowired
    private RestTemplate restTemplate;
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
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
    @GetMapping("/all")
        public List<LabSystem> getAllSystems(){
        HttpHeaders headers=new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<List> entity=new HttpEntity<List>(headers);
        return restTemplate.exchange("http://localhost:3001/get/all",HttpMethod.GET,entity,List.class).getBody();
    }
}
