package com.healthbyte.service.impl;

import com.healthbyte.dto.AddressDTO;
import com.healthbyte.dto.PatientDTO;
import com.healthbyte.model.Address;
import com.healthbyte.model.Patient;
import com.healthbyte.repository.AddressRepository;
import com.healthbyte.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.healthbyte.repository.PatientRepository;

import java.util.UUID;

@Service
public class PatientServiceImpl implements PatientService {

  @Autowired
  PatientRepository patientRepository;
  @Autowired
  AddressRepository addressRepository;


    @Override
    public PatientDTO getPatientById(UUID id) {
        Patient patient = patientRepository.findPatientById(id);
        System.out.println("patient "+ patient.toString());
        AddressDTO addressDTO = addressRepository.findAddressById(patient.getAddress_id()).toDto();
        PatientDTO patientDTO = patient.toDto();
        patientDTO.setAddress(addressDTO);

        return patientDTO;
    }

    @Override
    public PatientDTO savePatientRecord(PatientDTO patientDTO) {
        Address address = addressRepository.save(patientDTO.getAddress().toEntity());
        Patient patient = patientDTO.toEntity();
        patient.setAddress_id(address.getId());
        return patientRepository.save(patient).toDto();
    }

}
