package com.example.sell.entity;

public class Book {

    private Integer bookId;
    private String bookName;
    private String bookPrice;
    private Integer bookOwner;
    private User user;

    @Override
    public String toString() {
        return "Book{" +
                "booKId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookOwner=" + bookOwner +
                ", user=" + user +
                '}';
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getBooKId() {
        return bookId;
    }

    public void setBooKId(Integer booKId) {
        this.bookId = booKId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public Integer getBookOwner() {
        return bookOwner;
    }

    public void setBookOwner(Integer bookOwner) {
        this.bookOwner = bookOwner;
    }
}
