package com.healthbyte.model;

import com.healthbyte.dto.AddressDTO;
import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@Data
public class Address {


    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String address1;
    private String address2;
    private String state;
    private String city;
    private String zip;
    private String country;

    public AddressDTO toDto() {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setId(this.getId());
        addressDTO.setAddress1(this.getAddress1());
        addressDTO.setAddress2(this.getAddress2());
        addressDTO.setState(this.getState());
        addressDTO.setCity(this.getCity());
        addressDTO.setZip(this.getZip());
        addressDTO.setCountry(this.getCountry());

        return addressDTO;
    }
}
