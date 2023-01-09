package com.healthbyte.dto;

import com.healthbyte.model.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AddressDTO {
    private UUID id;
    private String address1;
    private String address2;
    private String state;
    private String city;
    private String zip;
    private String country;

    public Address toEntity() {
        Address address = new Address();
        address.setAddress1(this.getAddress1());
        address.setAddress2(this.getAddress2());
        address.setState(this.getState());
        address.setCity(this.getCity());
        address.setZip(this.getZip());
        address.setCountry(this.getCountry());

        return address;
    }
}
