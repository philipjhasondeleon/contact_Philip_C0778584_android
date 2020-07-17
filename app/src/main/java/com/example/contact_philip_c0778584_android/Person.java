package com.example.contact_philip_c0778584_android;

public class Person {
    int id;
    String fname,lname,phone,address,email;

    public Person(int id, String fname, String lname, String phone, String address,String email) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.phone = phone;
        this.address = address;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }
}
