import java.util.Scanner;

public class Assignment5 
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter a name: ");
        Scanner nameInput = new Scanner(System.in);
        String name = nameInput.nextLine();
        int nameLength = name.length();

        if (nameLength > 15) {
            System.out.println("That's a long name!");
        }
        else if (nameLength < 6) {
            System.out.println("That's a short and simple name!");
        }
        else if (nameLength <= 15 || nameLength >= 6) {
            System.out.println("That's a nice name, " + name + "!");
        }
    
        nameInput.close();
    
    }    
}
