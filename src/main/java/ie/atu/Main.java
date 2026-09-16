package ie.atu;

import java.sql.SQLOutput;

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
    }
}