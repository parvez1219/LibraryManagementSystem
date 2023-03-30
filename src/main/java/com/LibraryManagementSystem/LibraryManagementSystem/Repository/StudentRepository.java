package com.LibraryManagementSystem.LibraryManagementSystem.Repository;

import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
}
