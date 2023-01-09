package com.healthbyte.repository;

import com.healthbyte.model.Address;
import com.healthbyte.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AddressRepository extends JpaRepository<Address, UUID> {

    @Query("SELECT A FROM Address A WHERE A.id = 1")
    Address findAddressById(UUID id);
}
