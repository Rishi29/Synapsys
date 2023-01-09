package com.healthbyte.controller;

import com.healthbyte.model.Address;
import com.healthbyte.service.impl.AddressServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
//@RequestMapping("/")
public class AddressController {

    @Autowired
    private AddressServiceImpl addressServiceImpl;

    @GetMapping("/v1/address/{id}")
    public ResponseEntity<Address> getAddress(@PathVariable UUID id){
        Address address = addressServiceImpl.getAddress(id);
        return  new ResponseEntity<>(address, HttpStatus.OK);
    }


    @PostMapping("/v1/address")
    public ResponseEntity<Address> saveAddress(@RequestBody Address address){
        Address addressRs = addressServiceImpl.saveAddress(address);
        return new ResponseEntity<>(address, HttpStatus.OK);
    }

}
