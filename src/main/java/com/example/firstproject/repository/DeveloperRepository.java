package com.example.firstproject.repository;


import com.example.firstproject.entity.Developer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperRepository
        extends JpaRepository<Developer,Long> {

}
