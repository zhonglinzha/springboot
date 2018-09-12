package com.example.sell.entity;

public class Book {

    private Integer booKId;
    private String bookName;
    private String bookPrice;
    private Integer bookOwner;

    @Override
    public String toString() {
        return "Book{" +
                "booKId=" + booKId +
                ", bookName='" + bookName + '\'' +
                ", bookPrice='" + bookPrice + '\'' +
                ", bookOwner=" + bookOwner +
                '}';
    }

    public Integer getBooKId() {
        return booKId;
    }

    public void setBooKId(Integer booKId) {
        this.booKId = booKId;
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
