package com.example.tp2_jpa_v2.repository;

import com.example.tp2_jpa_v2.entities.consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface consultationReporsitory extends JpaRepository<consultation,Long> {
}
