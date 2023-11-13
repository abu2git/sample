package com.deploy.deploy;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Data {

    @Id
    int Id;

    String name;


    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
