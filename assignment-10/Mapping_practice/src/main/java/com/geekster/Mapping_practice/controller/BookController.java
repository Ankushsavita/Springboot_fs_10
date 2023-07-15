package com.geekster.Mapping_practice.controller;

import com.geekster.Mapping_practice.model.Book;
import com.geekster.Mapping_practice.model.Laptop;
import com.geekster.Mapping_practice.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @PostMapping("book")
    public void addBook(@RequestBody Book book){
        bookService.addBook(book);
    }

    @GetMapping("books")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }

    @PutMapping("book/{bookId}")
    public String updateBookById(@PathVariable Long bookId, @RequestBody Book newBook){
        return bookService.updateBookById(bookId , newBook);
    }

    @DeleteMapping("books/{bookId}")
    public String removeBookById(@PathVariable Long bookId){
        return bookService.removeBookById(bookId);
    }
}
