package com.example.tp2_jpa_v2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.tp2_jpa_v2.entities.medecin;

public interface medecinRepository extends JpaRepository<medecin,Long> {
    medecin findByNom(String nom);
}
