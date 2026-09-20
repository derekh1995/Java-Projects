//Derek Holbrook

package Module2;

import java.util.Scanner;

public class Assignment9 {
    
    public static void printLine(String str1, int num1, int num2) {
        //loop1
        for(int i = 0; i < num1; i++) {
            System.out.print(" ");
        }

        //loop2
        for(int i = 0; i < num2; i++) {
            System.out.print(str1);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        
        System.out.println("Please enter the height of the triangle: ");
        Scanner numInput1 = new Scanner(System.in);
        String num1 = numInput1.nextLine();
        int height = Integer.parseInt(num1); 

        for(int loopCount = 0; loopCount < height; loopCount++) {
            printLine("*", height-loopCount, 2*loopCount+1);

        }

        numInput1.close();
    }
}

// Notes: 
// Took me a day of troubleshooting to figure out why my code wasn't working. I didn't realize I needed to remove the "[]" the first method.
// I changed it from "public static void printLine(String[] str1, int num1, int num2)" to "public static void printLine(String str1, int num1, int num2)" and it worked.
// I also had to change both my for loops and remove the "=".
// I changed them from "for(int i = 0; i <= num1; i++)"" and "for(int i = 0; i <= num2; i++)" to "for(int i = 0; i < num1; i++)"" and "for(int i = 0; i < num2; i++)".
// Likewise, I had to change "for(int loopCount = 0; loopCount <= height; loopCount++)" to "for(int loopCount = 0; loopCount < height; loopCount++)".
