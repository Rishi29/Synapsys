package com.healthbyte.dto;

import com.healthbyte.model.Patient;
import com.healthbyte.model.Person;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PatientDTO extends Person {
    private UUID id;
    private String patientRegisteredNumber;
    private AddressDTO address;

    public Patient toEntity() {
        Patient patient = new Patient();
        patient.setFirstName(this.getFirstName());
        patient.setLastName(this.getLastName());
        patient.setPhoneNumber(this.getPhoneNumber());
        patient.setAge(this.getAge());
        patient.setPatientRegisteredNumber(this.getPatientRegisteredNumber());
        patient.setEmailId(this.getEmailId());

        return patient;
    }
}
