positive neg 0


import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // Create a Scanner object for user input
    Scanner scanner = new Scanner(System.in);
    
    // Prompt the user to enter a number
    System.out.print("Enter a number: ");
    
    // Read the input from the user
    int num = scanner.nextInt();

    // Condition to check if the number is negative, positive, or zero
    if (num == 0)
    {
      System.out.println("Zero");
    }
    else
    {
      String result = num > 0 ? "The number is positive" : "The number is negative";
      System.out.println(result);
    }
    
    
  }
}
