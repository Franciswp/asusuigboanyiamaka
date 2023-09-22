package com.asusuigbo.asusuigboanyiamaka.repository;

import com.asusuigbo.asusuigboanyiamaka.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends JpaRepository<Address, Integer> {

}
