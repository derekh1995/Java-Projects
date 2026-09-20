//Derek Holbrook

package Module3;

import java.util.Scanner;

public class Assignment11 {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        String[] names = new String[4];
        int[] grades = new int[4];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Enter name " + (i+1) + ":");
            names[i] = userInput.next();
            System.out.println("Enter grade for " + names[i] + ":");
            grades[i] = userInput.nextInt();
        }

        System.out.println();
        System.out.println("Summary:");
        System.out.println();

        int total = 0;
        for (int i = 0; i < grades.length; i++) {
            total = total + grades[i];
        }

        double average = (double) total / grades.length;
        System.out.println("The average grade is " + average);

        // Sort grades in ascending order
        for (int i = 0; i < grades.length - 1; i++) {
            int small = i;
            for (int j = i + 1; j < grades.length; j++) {
                if (grades[j] < grades[small]) {
                    small = j;
                }
            }

            // Swap grades
            int g = grades[i];
            grades[i] = grades[small];
            grades[small] = g;

            // Swap names
            String n = names[i];
            names[i] = names[small];
            names[small] = n;
        }

        System.out.println("Student grades in ascending order:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " " + grades[i]);
        }

        // Only curve if the maximum grade is LESS THAN 90!
        System.out.println("Student grades with curve of +6:");
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] < 90) {
                grades[i] += 6;
            }
        
        System.out.println(names[i] + " " + grades[i]);
        }

        userInput.close();
    }
}
