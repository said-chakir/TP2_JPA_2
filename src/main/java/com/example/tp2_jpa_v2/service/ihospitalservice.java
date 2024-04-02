package com.example.tp2_jpa_v2.service;

import com.example.tp2_jpa_v2.entities.consultation;
import com.example.tp2_jpa_v2.entities.medecin;
import com.example.tp2_jpa_v2.entities.patient;
import com.example.tp2_jpa_v2.entities.renderVous;

public interface ihospitalservice {
    patient savepatient(patient Patient);
    consultation saveconsultation (consultation Consultation);
    renderVous saverenderVous (renderVous Rendervous);
    medecin savemedecin (medecin Medecin);
}
