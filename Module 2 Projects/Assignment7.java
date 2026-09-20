//Derek Holbrook

package Module2;

import java.util.Scanner;

public class Assignment7 
{
    public static void main(String[] args) 
    {
        String colorAnswer = "yellow";
        Scanner colorInput = new Scanner(System.in);
        String colorChoice = "";

        while (colorChoice.trim().isEmpty()) {
            System.out.println("Please enter a color: ");
            colorChoice = colorInput.nextLine();   
        }

        if (colorChoice.equals(colorAnswer)) {
            System.out.println("You guessed it!");
        }
            
        else if (!colorChoice.equals(colorAnswer)) {
            System.out.println("Sorry, the answer is:");
            for(int i = 1; i <= 10; i++) {
                System.out.println(colorAnswer);
                }
        }

        colorInput.close();
    }
}

// Notes:
// I had to research the following methods to complete this project: ".trim()", ".isEmpty()", ".equals()"
// Initially, I tried using "if (colorChoice = colorAnswer)", but I kept getting an error stating that String variables cannot be used as booleans, so that prompted the .equals() research.
// Additionally, had to research using "!" prefixed to a variable in order to negate with the method.
// I also discovered during this assignment that I can chain methods together, as seen in "colorChoice.trim().isEmpty()"
