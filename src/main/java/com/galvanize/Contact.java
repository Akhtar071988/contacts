package com.galvanize;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class Contact {
    @Id
    @GeneratedValue
    private long id;

    public Contact() {
    }

    public void setId(long l) {
    }
}

