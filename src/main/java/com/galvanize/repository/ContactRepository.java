package com.galvanize.repository;

import com.galvanize.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository <Contact, Long> {
}
