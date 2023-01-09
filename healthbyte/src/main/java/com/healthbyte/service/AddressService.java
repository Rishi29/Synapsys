package com.healthbyte.service;

import com.healthbyte.model.Address;

import java.util.UUID;

public interface AddressService {
    Address getAddress(UUID id);
    Address saveAddress(Address address);
}
