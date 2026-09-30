package ie.atu;

public class Book {
    public String title;
    public String author;
    public int pageCount;
    public boolean available = true;

    public void displayDetails()
    {
        String status = available?"Available":"Not Available";
        System.out.println("Title: " + title + "Author: " + author);
        System.out.println("Page Count: " + pageCount + "Available: " + available);
    }

    public boolean isLongBook()
    {
        return pageCount >= 400;
    }

    public boolean hasTitle(String searchTitle)
    {
        return title !=null && title.equalsIgnoreCase(searchTitle);
    }

    public void borrowBook()
    {
        if (available)
        {
            available = false;
            System.out.println(title + " has been borrowed");

        }
        else
        {
            System.out.println(title + " is already borrowed");
        }
    }
}
