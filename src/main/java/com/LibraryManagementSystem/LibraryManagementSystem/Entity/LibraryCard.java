package com.LibraryManagementSystem.LibraryManagementSystem.Entity;

import com.LibraryManagementSystem.LibraryManagementSystem.Enum.CardStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LibraryCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardNo;

    @Enumerated(EnumType.STRING)
    private CardStatus cardStatus;
    private String expiry;


    //foreign key
    @OneToOne
    @JoinColumn
    Student student;
}
