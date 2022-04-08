package Lesson_07;

import java.util.Scanner;

public class Book {
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    String ISBN;
    String tittle;
    String authorName;
    String year;

    public Book() {
    }

    public Book(String ISBN, String tittle, String authorName, String year) {
        this.ISBN = ISBN;
        this.tittle = tittle;
        this.authorName = authorName;
        this.year = year;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTittle() {
        return tittle;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getYear() {
        return year;
    }

    public String toString() {
        return "Book{ "+"ISBN: "+ISBN+", name: "+tittle+", author: "+authorName+", year: "+year+" }";
    }
}
