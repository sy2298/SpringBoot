package com.example.firstproject.service;


import com.example.firstproject.repository.DeveloperRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DMakerService {
    private final DeveloperRepository developerRepository;

    public DMakerService(DeveloperRepository developerRepository){
        this.developerRepository = developerRepository;
    }
}
