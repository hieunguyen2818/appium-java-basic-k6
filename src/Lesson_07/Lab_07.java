package Lesson_07;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_07 {
    /**
     * LAB 7
     * Create a simple menu
     * 1. Input book
     * 2. Find book by ISBN
     * 0. Exit!
     * Book object
     * String ISBN
     * String title
     * String authorName
     * String/int year
     * Please override toString method to print out the found book.
     * If there is no matched book, please print out book not found
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Book> bookList = new ArrayList<>();
        boolean isContinue = true;
        while(isContinue) {
            System.out.println("Please input your choice: ");
            System.out.println("==========");
            System.out.println("1. Input book");
            System.out.println("2. Find book by ISBN");
            System.out.println("0. Exit!");
            int option = sc.nextInt();
            switch (option)  {
                case 1:
                    System.out.println("Input ISBN!");
                    String ISBN = sc.next();
                    System.out.println("Input title!");
                    String tittle = sc.next();
                    System.out.println("Input authorName!");
                    String authorName = sc.next();
                    System.out.println("Input year!");
                    String year = sc.next();

                    Book book = new Book(ISBN,tittle,authorName,year);
                    bookList.add(book);
                    System.out.println("Book has been added!");
                    break;

                case 2:
                    System.out.println("Please input your ISBN: ");
                    String temp = sc.next();
                    for(Book bk: bookList) {
                        if (bk.getISBN().equals(temp)) {
                            System.out.println("Your book is: ");
                            System.out.println(bk.toString());
                            break;
                        } else {
                            System.out.println("Cannot find your book!");
                        }
                    }
                    break;

                case 0: isContinue = false;
                    System.out.println("Thank you! see you again ! ");
                 break;
        }
    }
    }
}
