package com.healthbyte.model;

import com.healthbyte.dto.PatientDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Data
public class Patient extends Person {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;

    @Column(name = "patientregisterednumber")
    private String patientRegisteredNumber;

    //private Address address;

    public String getPatientRegisteredNumber() {
        return patientRegisteredNumber;
    }

    public void setPatientRegisteredNumber(String patientRegisteredNumber) {
        this.patientRegisteredNumber = patientRegisteredNumber;
    }

    public PatientDTO toDto() {
        PatientDTO patientDTO = new PatientDTO();
        patientDTO.setId(this.getId());
        patientDTO.setPatientRegisteredNumber(this.getPatientRegisteredNumber());
        patientDTO.setAge(this.getAge());
        patientDTO.setFirstName(this.getFirstName());
        patientDTO.setLastName(this.getLastName());
        patientDTO.setPhoneNumber(this.getPhoneNumber());
        patientDTO.setEmailId(this.getEmailId());
        return patientDTO;
    }
}
