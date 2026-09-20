//Derek Holbrook

package Module2;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment8 {
    
    public static int calculateSum(int a, int b, int c) {
        return a + b + c;
    }

    public static int calculateMedian(int x, int y, int z) {
        int[] medNum = {x, y, z};
        Arrays.sort(medNum);
        return medNum[1]; // Note to self: In brackets [], 0 for first position, 1 for second position, 2 for third position, etc.
    }

    public static void main(String[] args) {
        
        System.out.println("Let's find the sum and median of three integers!");

        System.out.println("Please enter the first value: ");
        Scanner numInput1 = new Scanner(System.in);
        String num1 = numInput1.nextLine();
        int numInt1 = Integer.parseInt(num1);

        System.out.println("Please enter the second value: ");
        Scanner numInput2 = new Scanner(System.in);
        String num2 = numInput2.nextLine();
        int numInt2 = Integer.parseInt(num2);

        System.out.println("Please enter the third value: ");
        Scanner numInput3 = new Scanner(System.in);
        String num3 = numInput3.nextLine();
        int numInt3 = Integer.parseInt(num3);

        int callSum = calculateSum(numInt1, numInt2, numInt3);
        int callMed = calculateMedian(numInt1, numInt2, numInt3);

        System.out.println("The sum is " + callSum + ".");
        System.out.println("The median is " + callMed + ".");

        numInput1.close();
        numInput2.close();
        numInput3.close();

    }
}

// I was having some trouble on the calculateMedian portion, so I had to research array sorting. I saw there are math module imports as well to assist with the median, but I chose array sorting and imported the java.util.Arrays
