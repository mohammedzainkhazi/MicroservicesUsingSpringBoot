package com.example.mslabspringboottest.service;

import com.example.mslabspringboottest.model.LabSystem;
import com.example.mslabspringboottest.repository.LabRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LabService {
    private final LabRepository repository;
    public LabService(LabRepository repository) {
        this.repository = repository;
    }
    public LabSystem getSystem(String id){
        return repository.findById(id).orElse(null);
    }
    public List<LabSystem> getAll(){
        return repository.findAll();
    }
}
