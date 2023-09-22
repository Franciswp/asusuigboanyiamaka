package com.asusuigbo.asusuigboanyiamaka.rest;

import com.asusuigbo.asusuigboanyiamaka.model.Contact;
import com.asusuigbo.asusuigboanyiamaka.model.Person;
import com.asusuigbo.asusuigboanyiamaka.repository.ContactRepository;
import com.asusuigbo.asusuigboanyiamaka.repository.PersonRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("path=api/person")
public class ControllerRestPerson {

    @Autowired private PersonRepository personRepository;
    @Autowired private ContactRepository contactRepository;

    @GetMapping("/getAll")
    @ResponseBody
    public List<Person> getAllPersons(){
        return personRepository.findAll();
    }

    @GetMapping("/getMessagesByStatus")
    @ResponseBody
    public List<Contact> getAllMsgsByStatus(@RequestBody Contact contact){
        if(null != contact && null != contact.getStatus()){
            return contactRepository.findByStatus(contact.getStatus());
        }else{
            return List.of();
        }
    }


}
