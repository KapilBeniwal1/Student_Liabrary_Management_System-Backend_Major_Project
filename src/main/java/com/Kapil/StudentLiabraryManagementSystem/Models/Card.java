package com.Kapil.StudentLiabraryManagementSystem.Models;


import com.Kapil.StudentLiabraryManagementSystem.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //auto generate/increment
    private int id; //Its auto generated

    @CreationTimestamp//Auto timestamp -  the time when an entry is created
    Date createOn; //Its auto generated

    @UpdateTimestamp //set time when an entry is updated with any other status
    Date updateOn; //Its auto generated


    //as SQL not understand what is string till now.
    // so, we need to convert it into string so that it tells sql that please considered it
    // as string
    @Enumerated(value = EnumType.STRING) // import ENUM
    private CardStatus cardStatus; // we explicitly Set this attribute


    @OneToOne
    @JoinColumn
    private Student studentVariableName; // this variable "studentVariableName" is used in the parent class...
                                         // while doing  bi-directional mapping

    //Card is parent wrt to Book
//    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
//    List<Book> booksIssued = new ArrayList<>();

    public Card(){  //default constructor

    }

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreateOn() {
        return createOn;
    }

    public void setCreateOn(Date createOn) {
        this.createOn = createOn;
    }

    public Date getUpdateOn() {
        return updateOn;
    }

    public void setUpdateOn(Date updateOn) {
        this.updateOn = updateOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
