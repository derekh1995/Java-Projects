import java.util.Scanner;

public class Assignment3 
{
    public static void main(String[] args) 
    {
        System.out.println("Please type your name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();

        System.out.println("Please type the year in which you were born: ");
        Scanner yearInput = new Scanner(System.in);
        String year = yearInput.next();

        int yearInt = Integer.parseInt(year);
        int age = 2026 - yearInt;

        System.out.println("Hello, " + name + "! You are about " + age + " years old, right?");
        
        nameInput.close();
        yearInput.close();
    }    
}
// Things I had to research for this assignment:
// Changing string variables to integers with Integer.parseInt().
// Adding the variable.close() lines, since VS Code was marking it as a problem that the inputs were not closed.
// Changing .next() to .nextLine(), since everything after my first name wasn't included in the input.
// How to comment out lines in Java. I knew it was "#" in Python, but now I know to use "//" for Java.
