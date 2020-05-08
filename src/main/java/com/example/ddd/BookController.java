package com.example.ddd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private BookRepository bookRepository;
    @GetMapping("/init")
    public void init(){
        Book book1 = new Book("id001","Book name1");
        Book book2= new Book("id002","Book name2");
        bookRepository.save(book1);
        bookRepository.save(book2);
    }
    @GetMapping("/book")
    public Book getBook(){
        return new Book("id001","Book name");
    }

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookRepository.findAll();
    }
}
