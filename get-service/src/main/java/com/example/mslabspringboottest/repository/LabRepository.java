package com.example.mslabspringboottest.repository;

import com.example.mslabspringboottest.model.LabSystem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LabRepository extends JpaRepository<LabSystem,String> {
}
