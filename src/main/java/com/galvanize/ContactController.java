package com.galvanize;

import com.galvanize.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contacts")
public class ContactController {
    @Autowired
    ContactRepository contactRepository;

    @PostMapping
    public Contact createUser(@RequestBody Contact contact){
     return contactRepository.save(contact);
    }
}
