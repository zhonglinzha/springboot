package com.example.sell.service;

import com.example.sell.dao.BookMapper;
import com.example.sell.entity.Book;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {

    @Autowired
    BookMapper bookMapper;


    public Integer insertBook(Book book) {
        return bookMapper.insertBook(book);
    }

    public Integer updateBook(Integer bookId, String bookName, String bookPrice, Integer bookOwner) {
        return bookMapper.updateBook(bookId, bookName, bookPrice, bookOwner);

    }

    public Integer deleteBook(Book book) {
        return bookMapper.deleteBook(book);
    }

    public Book getBook(Integer bookId, String bookName, String bookPrice, Integer bookOwner) {
        return bookMapper.getBook(bookId, bookName, bookPrice, bookOwner);
    }

    public Book getBook(Book book) {
        return bookMapper.getBook(book);
    }

    public List<Book> getBooks(Integer bookId) {
        return bookMapper.getBooks(bookId);
    }
}
