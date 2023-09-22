package com.asusuigbo.asusuigboanyiamaka.repository;

import com.asusuigbo.asusuigboanyiamaka.model.Contact;
import com.asusuigbo.asusuigboanyiamaka.model.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    Person readByEmail(String email);

}
