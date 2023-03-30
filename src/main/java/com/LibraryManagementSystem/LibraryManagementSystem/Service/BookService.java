package com.LibraryManagementSystem.LibraryManagementSystem.Service;

import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Author;
import com.LibraryManagementSystem.LibraryManagementSystem.Entity.Book;
import com.LibraryManagementSystem.LibraryManagementSystem.Repository.AuthorRepository;
import com.LibraryManagementSystem.LibraryManagementSystem.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Book book) throws Exception {
        Author author;
        try{
            author=authorRepository.findById(book.getAuthor().getId()).get();
        }
        catch (Exception e){
            return "Failed to add Book.Author not found";
        }

        List<Book> booksByAuthor=author.getBooks();
        booksByAuthor.add(book);

        authorRepository.save(author);

        return "Book added";


        //bookRepository.save(book);
    }

    public List<Book> getBooks() {
        return bookRepository.findAll();
    }
}
