package oop.oop_enum;

public class Book {

    String name;
    Type bookType;
    String author;

    public Book(String name, String author, Type bookType) {
        this.name = name;
        this.bookType = bookType;
        this.author = author;
    }
}
