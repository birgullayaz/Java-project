package com.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "second_users")
public class SecondUser {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "name", nullable = false)
    private String name;
    
    @Column(name = "surname", nullable = false)
    private String surname;
    
    // Default constructor
    public SecondUser() {
    }
    
    // Constructor with name and surname
    public SecondUser(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
    
    // Getters and Setters
    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSurname() {
        return surname;
    }
    
    public void setSurname(String surname) {
        this.surname = surname;
    }
}

