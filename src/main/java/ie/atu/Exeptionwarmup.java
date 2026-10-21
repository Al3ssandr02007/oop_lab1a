package ie.atu;

import java.util.Scanner;

public class Exeptionwarmup
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean valid = false;

        while(!valid)
        {
            System.out.println("Please enter number: ");
            String text = scan.nextLine();
            try
            {
                int pageCount = Integer.parseInt(text);
                System.out.println("You entered " + pageCount);
                valid = true;
            }
            catch (NumberFormatException e)
            {
                System.out.println("You entered an invalid input");
            }
        }
        System.out.println("Program continues.");

    }
}
