package com.example.tp2_jpa_v2.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;        /////// bidirection
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class patient {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @Temporal(TemporalType.DATE)
    private Date dateNaissace;
    private  boolean malade;
    @OneToMany(mappedBy = "Patient",fetch=FetchType.LAZY)
    private Collection <renderVous> rendervous;


}
