package com.asusuigbo.asusuigboanyiamaka.service;

import com.asusuigbo.asusuigboanyiamaka.controller.ContactController;
import com.asusuigbo.asusuigboanyiamaka.model.Contact;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.context.annotation.SessionScope;

@Service @Slf4j  @ApplicationScope //@SessionScope //@RequestScope
public class ContactService {

    private int counter = 0;

    public ContactService(){
        System.out.println("Contact Service Bean initialized");
    }

    public boolean saveMessageDetails(Contact contact){
        boolean isSaved = true;
        //TODO - Need to persist the data into the DB table
        log.info(contact.toString());
        return isSaved;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }
}
