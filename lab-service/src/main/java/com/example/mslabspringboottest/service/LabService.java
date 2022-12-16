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
    public LabSystem create(LabSystem system){
        return repository.save(system);
    }
    public LabSystem update(LabSystem system,String id){
        LabSystem sys = repository.findById(id).get();
        sys.setBrand(system.getBrand());
        sys.setHdd(system.getHdd());
        sys.setOs(system.getOs());
        sys.setDualBoot(system.getDualBoot());
        sys.setRam(system.getRam());
        repository.save(sys);
        return sys;
    }

    public void deleteSystem(String id){
        repository.deleteById(id);
    }

    public void deleteAll(){
        repository.deleteAll();
    }

}
