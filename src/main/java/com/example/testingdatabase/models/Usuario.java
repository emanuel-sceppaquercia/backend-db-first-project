package com.example.testingdatabase.models;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class Usuario {

    @Id
    @Getter @Setter @Column(name = "id")
    private int id;

    @Getter @Setter @Column(name = "name")
    private String name;

    @Getter @Setter @Column(name = "user")
    private String userName;

    @Getter @Setter @Column(name = "email")
    private String email;

    @Getter @Setter @Column(name = "password")
    private String password;

}
