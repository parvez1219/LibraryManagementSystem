package com.LibraryManagementSystem.LibraryManagementSystem.Service;

import com.LibraryManagementSystem.LibraryManagementSystem.Entity.LibraryCard;
import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Student;
import com.LibraryManagementSystem.LibraryManagementSystem.Enum.CardStatus;
import com.LibraryManagementSystem.LibraryManagementSystem.LibraryManagementSystemApplication;
import com.LibraryManagementSystem.LibraryManagementSystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public void addStudent(Student student) {

        //creating card for student
        LibraryCard card=new LibraryCard();
        card.setCardStatus(CardStatus.ACTIVATED);
        card.setExpiry("12/2025");
        card.setStudent(student);


        //setting card for student
        student.setCard(card);

        //saving in database
        studentRepository.save(student);
    }
}
