package com.pms.entity;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id;
    String Firstname;
    String Lastname;
    String Address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public Person(){

    }
    public Person(int id, String firstname, String lastname, String address) {
        this.id = id;
        Firstname = firstname;
        Lastname = lastname;
        Address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Firstname='" + Firstname + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
