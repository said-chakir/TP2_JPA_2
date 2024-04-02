package com.example.tp2_jpa_v2.service;

import com.example.tp2_jpa_v2.entities.consultation;
import com.example.tp2_jpa_v2.entities.medecin;
import com.example.tp2_jpa_v2.entities.patient;
import com.example.tp2_jpa_v2.entities.renderVous;
import com.example.tp2_jpa_v2.repository.medecinRepository;
import com.example.tp2_jpa_v2.repository.consultationReporsitory;
import com.example.tp2_jpa_v2.repository.patientRepository;
import com.example.tp2_jpa_v2.repository.renderVousRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Transactional
public class hospitalserviceImpl implements ihospitalservice {
    private patientRepository PatientRepository;
    private consultationReporsitory ConsultationRepository;
    private medecinRepository MedecinRepository;
    private renderVousRepository RenderVousRepository;

    public hospitalserviceImpl(patientRepository patientRepository, consultationReporsitory consultationRepository, medecinRepository medecinRepository, renderVousRepository renderVousRepository) {
        PatientRepository = patientRepository;
        ConsultationRepository = consultationRepository;
        MedecinRepository = medecinRepository;
        RenderVousRepository = renderVousRepository;
    }

    @Override
    public patient savepatient(patient Patient) {
        return PatientRepository.save(Patient);

    }

    @Override
    public consultation saveconsultation(consultation Consultation) {
        return ConsultationRepository.save(Consultation);

    }

    @Override
    public renderVous saverenderVous(renderVous Rendervous) {
        Rendervous.setId(UUID.randomUUID().toString());
        return RenderVousRepository.save(Rendervous);
    }

    @Override
    public medecin savemedecin(medecin Medecin) {
        return MedecinRepository.save(Medecin);
    }
}
