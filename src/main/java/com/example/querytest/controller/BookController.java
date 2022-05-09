package com.example.querytest.controller;

import com.example.querytest.models.Books;
import com.example.querytest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/book")
    public ArrayList<Books> getBooks(@RequestParam("author") String author){
        return bookService.getBooks(author);
    }

    @PostMapping("/books")
    public String createBooks(@RequestBody Books book){
        return bookService.savebooks(book);
    }

}
