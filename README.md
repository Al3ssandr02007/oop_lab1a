Lab 3

The 7 day call works because it is within the 14 day limit, so it reaches borrowBook(). 
The 15 day call doesn't because it is over the limit. 
The book is AVAILABLE before the 15 day call because it was returned before.




I used the JDK version required for the lab and the Java package ie.atu

In the constructoor I check for null before using isBlank(),
because calling isBlank() on a null value would cause an eror

title, author and pageCount are final because they should not change after the Book is created.
Status is not final because it needs to change when a book is borrowed or returned.

I used borrowBook() and returnBook() instead of a status setter 
because the status should only change when one of these actions happens.

The Book class checks things related to the book itself, such as the title, author, page count and current status. LibraryService
checks things related to the library rules, such as the maximum loan period.

A successful loan changes the book from AVAILABLE to ON_LOAN. A loan is rejected if the number of days is not allowed. A return is rejected if the book is already available. 
The Maven build completed successfully after the code was tested.

Using the debugger I could see the values of the fields and how the status changed while the program was running.

I used AI quite a lot to help me write these explanations clearly in English and to translate my explanations from Italian,
because my English is not very strong.