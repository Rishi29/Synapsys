package com.healthbyte.service.impl;

import com.healthbyte.model.Address;
import com.healthbyte.repository.AddressRepository;
import com.healthbyte.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressRepository addressRepository;

    @Override
    public Address getAddress(UUID id) {
        Address addressRs = addressRepository.findAddressById(id);
        return addressRs;
    }

    @Override
    public Address saveAddress(Address address) {

        Address addressRs = addressRepository.save(address);
        return addressRs;
    }
}
