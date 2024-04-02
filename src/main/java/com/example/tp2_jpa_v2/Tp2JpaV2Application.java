package com.example.tp2_jpa_v2;

import com.example.tp2_jpa_v2.entities.*;
import com.example.tp2_jpa_v2.repository.consultationReporsitory;
import com.example.tp2_jpa_v2.repository.medecinRepository;
import com.example.tp2_jpa_v2.repository.patientRepository;
import com.example.tp2_jpa_v2.repository.renderVousRepository;
import com.example.tp2_jpa_v2.service.ihospitalservice;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class Tp2JpaV2Application {

    public static void main(String[] args) {
        SpringApplication.run(Tp2JpaV2Application.class, args);}
    @Bean
    CommandLineRunner Start(ihospitalservice hospitalservice,
                            medecinRepository MedecinRepository,
                            patientRepository PatientRepository,
                            renderVousRepository RendeerVousRepository,
                            consultationReporsitory ConsultationRepository){
        return args -> {
            Stream.of("said","omar","mostafa").forEach(name->{
                patient Patient=new patient();
                Patient.setMalade(false);
                Patient.setNom(name);
                Patient.setDateNaissace(new Date());
                hospitalservice.savepatient(Patient);
            });
            Stream.of("hassan","kamal","mohammed").forEach(name->{
                    medecin Medecin=new medecin();
                    Medecin.setNom(name);
                    Medecin.setEmail(name+"@gmail.com");
                    Medecin.setSpecialite(Math.random()<0.5?"cadio":"dentiste");
                    hospitalservice.savemedecin(Medecin);
            });
            patient Patient=PatientRepository.findByNom("said");
            patient Patient1=PatientRepository.findById(1L).orElse(null);

            medecin Medecin=MedecinRepository.findByNom("kamal");
            medecin Medecin1=MedecinRepository.findById(1L).orElse(null);

            renderVous  RenderVous=new renderVous();
            RenderVous.setDate(new Date());
            RenderVous.setStatus(statusRDv.PENDING);
            RenderVous.setPatient(Patient);
            RenderVous.setMedecin(Medecin);
            hospitalservice.saverenderVous(RenderVous);

            renderVous RenderVous1= RendeerVousRepository.findAll().get(0) ;
            consultation Consultation=new consultation();
            Consultation.setDateConsultation(new Date());
            Consultation.setRendervous(RenderVous1);
            Consultation.setRapport("rapport de la .......");
           ConsultationRepository.save(Consultation);

        };
    }

}
