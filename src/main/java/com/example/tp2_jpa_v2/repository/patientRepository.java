package com.example.tp2_jpa_v2.repository;

import com.example.tp2_jpa_v2.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface patientRepository extends JpaRepository<patient,Long> {
    patient findByNom(String nom);
}
