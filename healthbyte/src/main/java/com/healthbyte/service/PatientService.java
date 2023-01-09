package com.healthbyte.service;

import com.healthbyte.dto.PatientDTO;
import com.healthbyte.model.Patient;

import java.util.UUID;

public interface PatientService {

     PatientDTO getPatientById(UUID id);
     PatientDTO savePatientRecord(PatientDTO patient);
}
