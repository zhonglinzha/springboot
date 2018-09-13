package com.example.sell.dao;

import com.example.sell.entity.Book;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookMapper {

    Integer insertBook(Book book);

    Integer updateBook(@Param("bookId") Integer bookId, @Param("bookName") String bookName, @Param("bookPrice") String bookPrice, @Param("bookOwner") Integer bookOwner);

    Integer deleteBook(Book book);

    Book getBook(@Param("bookId") Integer bookId, @Param("bookName") String bookName, @Param("bookPrice") String bookPrice, @Param("bookOwner") Integer bookOwner);

    Book getBook(Book book);

    List<Book> getBooks(Integer bookOwner);


}
