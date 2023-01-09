package com.healthbyte.repository;

import com.healthbyte.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PatientRepository extends JpaRepository<Patient, UUID> {

    @Query("SELECT p FROM Patient p WHERE p.id = 1")
    Patient findPatientById(UUID id);

 }
