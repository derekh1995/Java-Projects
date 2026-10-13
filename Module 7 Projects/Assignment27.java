package a27;

import org.apache.commons.lang3.math.Fraction;
import java.util.Scanner;

public class Assignment27 {
    public static void main(String[] args) {
    
        System.out.println("Please enter the first numerator: ");
        Scanner numeratorInput1 = new Scanner(System.in);
        String num1 = numeratorInput1.nextLine();
        int numeratorInt1 = Integer.parseInt(num1);
        
        System.out.println("Please enter the first denominator: ");
        Scanner denominatorInput1 = new Scanner(System.in);
        String num2 = denominatorInput1.nextLine();
        int denominatorInt1 = Integer.parseInt(num2);
        
        System.out.println("Please enter the second numerator: ");
        Scanner numeratorInput2 = new Scanner(System.in);
        String num3 = numeratorInput2.nextLine();
        int numeratorInt2 = Integer.parseInt(num3);
        
        System.out.println("Please enter the second denominator: ");
        Scanner denominatorInput2 = new Scanner(System.in);
        String num4 = denominatorInput2.nextLine();
        int denominatorInt2 = Integer.parseInt(num4);
    	
        System.out.println("");
        
        Fraction fraction1 = Fraction.getFraction(numeratorInt1, denominatorInt1);
        System.out.println("The first fraction is " + fraction1);
        
        Fraction absolute = fraction1.abs();
        System.out.println("- Absolute value: " + absolute);

        Fraction inversion = fraction1.invert();
        System.out.println("- Inversion: " + inversion);
        
        Fraction squared = fraction1.pow(2);
        System.out.println("- Squared: " + squared);
        
        Fraction reduced = fraction1.reduce();
        System.out.println("- Reduced: " + reduced);
        
        System.out.println("");
        System.out.println("**********");
        System.out.println("");
        
        Fraction fraction2 = Fraction.getFraction(numeratorInt2, denominatorInt2);
        System.out.println("The second fraction is " + fraction2);
        
        Fraction absolute2 = fraction2.abs();
        System.out.println("- Absolute value: " + absolute2);

        Fraction inversion2 = fraction2.invert();
        System.out.println("- Inversion: " + inversion2);
        
        Fraction squared2 = fraction2.pow(2);
        System.out.println("- Squared: " + squared2);
        
        Fraction reduced2 = fraction2.reduce();
        System.out.println("- Reduced: " + reduced2);
        
        System.out.println("");
        System.out.println("**********");
        System.out.println("");
        
        // if (fraction1.equals(fraction2)) {
        if (fraction1.compareTo(fraction2) == 0) {
        	System.out.println(fraction1 + " and " + fraction2 + " are equal to each other");
        }

        else if (fraction1.compareTo(fraction2) > 0) {
            System.out.println(fraction1 + " is greater than " + fraction2);
            System.out.println(fraction2 + " is less than " + fraction1);
        }
        
        else {
            System.out.println(fraction2 + " is greater than " + fraction1);
            System.out.println(fraction1 + " is less than " + fraction2);
        }

        		
        numeratorInput1.close();
        denominatorInput1.close();
        numeratorInput2.close();
        denominatorInput2.close();
        
    }
}

//I originally had "if (fraction1.equals(fraction2))"
//It worked sometimes, but I tried 20/10 and 100/50 and it said 100/50 was greater than 20/10 even though they're both equal
//I changed it to "if (fraction1.compareTo(fraction2) == 0)" and it seems to be working properly now
