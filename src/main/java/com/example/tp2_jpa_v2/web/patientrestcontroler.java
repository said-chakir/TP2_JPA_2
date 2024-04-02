package com.example.tp2_jpa_v2.web;

import com.example.tp2_jpa_v2.entities.patient;
import com.example.tp2_jpa_v2.repository.patientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class patientrestcontroler {
    @Autowired
    private patientRepository PatientRepository;
    @GetMapping("/patients")
    public List<patient> patientList(){
        return PatientRepository.findAll();
    }
}
