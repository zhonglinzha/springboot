package com.example.sell.controller;

import com.example.sell.entity.Book;
import com.example.sell.service.BookService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class BookController {

   @Autowired
    BookService bookService;


   @PostMapping("/insertBook")
   public Integer insertBook(Book book){
       return bookService.insertBook(book);
   }

   @PostMapping("/updateBook")
   public Integer updateBook(Book book){
       return bookService.updateBook(book.getBooKId(),book.getBookName(),book.getBookPrice(),book.getBookOwner());
   }

   @PostMapping("/deleteBook")
   public Integer deleteBook(Book book){
        return bookService.deleteBook(book);
   }

   @PostMapping("/getBook")
   public Book getBook(Book book){
       return bookService.getBook(book);
   }

   @PostMapping("/getBook_")
   public Book getBook_(Book book){
       return bookService.getBook(book.getBooKId(),book.getBookName(),book.getBookPrice(),book.getBookOwner());
   }

//   @PostMapping("/getBooks")
//   public List<Book> getBooks(){
//       return bookService.getBooks();
//
//   }

}
