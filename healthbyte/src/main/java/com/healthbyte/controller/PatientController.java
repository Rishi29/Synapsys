package com.healthbyte.controller;

import com.healthbyte.dto.PatientDTO;
import com.healthbyte.model.Patient;
import com.healthbyte.service.PatientService;
import com.healthbyte.service.impl.PatientServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/v1")
public class PatientController {

    @Autowired
    PatientService patientService;

    @GetMapping("/hello")
    public  String hello(){
        return "Hello Spring";
    }

    @GetMapping("/patient/{id}")
    public ResponseEntity<PatientDTO> getPatientById(@PathVariable UUID id){

        PatientDTO patient = null;
        try{
            patient = patientService.getPatientById(id);
           // return new ResponseEntity(patient, HttpStatus.OK);
        }catch(Exception ex){
            //return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping("/v1/patient")
    public ResponseEntity<PatientDTO> savePatientRecord(@RequestBody PatientDTO patient){
        PatientDTO patientDTO =  patientService.savePatientRecord(patient);

        return new ResponseEntity<>(patientDTO, HttpStatus.CREATED);
    }
}
