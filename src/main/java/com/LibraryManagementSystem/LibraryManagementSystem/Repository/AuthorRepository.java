package com.LibraryManagementSystem.LibraryManagementSystem.Repository;

import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer> {
}
