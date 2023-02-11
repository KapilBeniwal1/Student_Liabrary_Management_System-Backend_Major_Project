package com.Kapil.StudentLiabraryManagementSystem.Service;

import com.Kapil.StudentLiabraryManagementSystem.Enums.CardStatus;
import com.Kapil.StudentLiabraryManagementSystem.Models.Card;
import com.Kapil.StudentLiabraryManagementSystem.Models.Student;
import com.Kapil.StudentLiabraryManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public String addStudent(Student student){

        //Student from the postman is already have the basic attribute set

        //Card should also be generated when the create function of Student class is called

        Card card = new Card(); //object of card class
        card.setCardStatus(CardStatus.ACTIVATED); //set ENUM value
        card.setStudentVariableName(student); // from this it will come to know which student id is needed to be saved
                                              // and using this attribute the foreign key is to be set

        //Let's go to the student
        student.setCard(card);

        //If we are using unidirectional mapping : we had to save both of them
        //studentRepo.save () and cardRepo.save()

        //But we are Good Programmer and using bidirectional : Child will automatically be saved.

        studentRepository.save(student);
        //By cascading effect, child will automatically be saved (cardRepo will be saved)

        return "Student and Card added";
    }
}
