package com.example.tp2_jpa_v2.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class consultation {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    private Date dateConsultation;
    private  String rapport;
    @OneToOne(mappedBy = "Consultation")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private  renderVous rendervous;
}
