package com.Kapil.StudentLiabraryManagementSystem.Models;

import jakarta.persistence.*;

@Entity
@Table(name="student_db")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate/increment
    private int id;

    private String name;

    @Column(unique = true)
    private String email;

    private int mobNo;

    private int age;

    private String country;


    //name of the variable of the parent entity that you have written in child class foreign key attribute
    //Bi-directional mapping
    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private Card card;


    public Student(){  //Default constructor

    }

    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getMobNo() {
        return mobNo;
    }

    public void setMobNo(int mobNo) {
        this.mobNo = mobNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
