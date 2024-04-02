package com.example.tp2_jpa_v2.repository;

import com.example.tp2_jpa_v2.entities.renderVous;
import org.hibernate.type.descriptor.converter.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface renderVousRepository extends JpaRepository<renderVous,String> {
}
