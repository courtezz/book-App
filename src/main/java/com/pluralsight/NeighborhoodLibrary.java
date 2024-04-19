package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {
    public static void main(String[] args) {
        book b1 = new book();
        book b2 = new book();






        book[] books = {
                b1, b2
        };


        System.out.println("please pick a book from the following list: \n");

        printAllBooks(books);








        boolean found = false;

        while(!found) {
            System.out.println("\nEnter the id of the book you want: ");




            Scanner scanner = new Scanner(System.in);
            String input = Scanner.nextLine();
            int inputNumber = Integer.parseInt(input);

            book theBook = findBookById(inputNumber, books);
            if(theBook != null) found =true;

            if(foynd){
                Ssytem.out.println("I  FOUND IT !!!")
                System.out.println(theBook);

            } else {
                System.out.println("Sorry.  I don't have that book id...");
            }

        }

    }


    static void printAllBooks(Book[] books) {
        for (Book b : books) {
            System.out.println(b.getId() + ":  " + b.getTitle());
        }
    }


    static Book findBookById(int id, Book[] books) {
        for (Book b : books) {
            if (id == b.getId()) {
                return b;
            }
        }
        return null;
    }

}


