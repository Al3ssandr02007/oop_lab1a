package ie.atu;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Hello World");
        Book firstBook = new Book();
        firstBook.title = "First Book";
        firstBook.author = "John Lennon";
        firstBook.pageCount = 412;

        System.out.println("First Book: " + firstBook.title);
        System.out.println("First Book Author: " + firstBook.author);
        System.out.println("First Book PageCount: " + firstBook.pageCount);
        System.out.println("First Book Available: " + firstBook.available);

        firstBook.displayDetails();
        System.out.println("Long book: " + firstBook.isLongBook());
        firstBook.borrowBook();
        firstBook.displayDetails();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book Title: ");
        String title = input.nextLine();
        System.out.println("You entered " + title);
        Book newbook = new Book();
        newbook.title = title;
        if(newbook.hasTitle(title))
        {
            System.out.println(title + " Book Title already Exists");
        }
        else
        {
            System.out.println(title + " No Book Title Exists");
        }
    }
    }
