//Derek Holbrook

package Module2;

import java.util.Scanner;

public class Assignment10 {
    
    public static void doArithmetic(int a, int b) {
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
    
    public static void main(String[] args) {
        
        System.out.println("Let's do some math!");

        System.out.println("Please enter the first variable: ");
        Scanner numInput1 = new Scanner(System.in);
        String num1 = numInput1.nextLine();
        int numInt1 = Integer.parseInt(num1);

        System.out.println("Please enter the second variable: ");
        Scanner numInput2 = new Scanner(System.in);
        String num2 = numInput2.nextLine();
        int numInt2 = Integer.parseInt(num2);

        try {
            doArithmetic(numInt1, numInt2);
        }

        catch(final ArithmeticException c) {
            System.out.println("There was a problem computing arithmetic results.");
        }

        numInput1.close();
        numInput2.close();

    }
}
// Note: The "ArithmeticException c" catch is executed when attempting to divide by 0. Unsure if there are any other triggers.
