package com.sms.studentmanagementsytem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String username;
    private  String kduid;
    private String dob;
    private String address;
    private String degreepro;
    private String academicyear;

    public String getKduid() {
        return kduid;
    }

    public void setKduid(String kduid) {
        this.kduid = kduid;
    }

    public String getAcademicyear() {
        return academicyear;
    }

    public void setAcademicyear(String academicyear) {
        this.academicyear = academicyear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDegreepro() {
        return degreepro;
    }

    public void setDegreepro(String degreepro) {
        this.degreepro = degreepro;
    }


    }

