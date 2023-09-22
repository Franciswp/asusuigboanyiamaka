package com.asusuigbo.asusuigboanyiamaka.service;

import com.asusuigbo.asusuigboanyiamaka.constants.AsusuigboConstants;
import com.asusuigbo.asusuigboanyiamaka.model.Person;
import com.asusuigbo.asusuigboanyiamaka.model.Roles;
import com.asusuigbo.asusuigboanyiamaka.repository.PersonRepository;
import com.asusuigbo.asusuigboanyiamaka.repository.RolesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private RolesRepository rolesRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public boolean createNewPerson(Person person){
        boolean isSaved = false;
        Roles role = rolesRepository.getByRoleName(AsusuigboConstants.STUDENT_ROLE);
        person.setRoles(role);
        person.setPwd(passwordEncoder.encode(person.getPwd()));
        person = personRepository.save(person);
        if (null != person && person.getPersonId() > 0)
        {
            isSaved = true;
        }
        return isSaved;
    }
}
