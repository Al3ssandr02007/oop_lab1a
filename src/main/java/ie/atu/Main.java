package ie.atu;


public class Main {
    public static void main(String[] args) {
        try {
            Book myBook = new Book("Dune", "Author", 412);
            System.out.println(myBook.getTitle());
            System.out.println(myBook.getAuthor());
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
