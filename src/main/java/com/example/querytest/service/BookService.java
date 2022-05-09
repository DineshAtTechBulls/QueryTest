package com.example.querytest.service;

import com.example.querytest.models.Books;
import com.example.querytest.repos.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public ArrayList<Books> getBooks(String author){
        return bookRepository.findBooksByAuthor(author);
    }

    public String savebooks(Books book){
        System.out.println(book);
        try {
            bookRepository.save(book);
            System.out.println(bookRepository.findAll());
            return "success";
        }catch(Exception e){
            return e.getMessage();
        }
    }
}
