package com.geekster.Mapping_practice.service;

import com.geekster.Mapping_practice.model.Book;
import com.geekster.Mapping_practice.model.Laptop;
import com.geekster.Mapping_practice.repository.IBookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    IBookRepo bookRepo;

    public void addBook(Book book) {
        bookRepo.save(book);
    }

    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    public String updateBookById(Long bookId, Book newBook) {
        Optional<Book> myBookOpt = bookRepo.findById(bookId);

        Book myBook = null;

        if(myBookOpt.isPresent()){
            myBook = myBookOpt.get();
        }else{
            return "id not found";
        }

        myBook.setBookId(newBook.getBookId());
        myBook.setBookAuthor(newBook.getBookAuthor());
        myBook.setBookDescription(newBook.getBookDescription());
        myBook.setBookPrice(newBook.getBookPrice());
        myBook.setBookTitle(newBook.getBookTitle());

        bookRepo.save(myBook);
        return "book updated";
    }

    public String removeBookById(Long bookId) {
        bookRepo.deleteById(bookId);
        return "book deleted successfully with id : " + bookId;
    }
}
