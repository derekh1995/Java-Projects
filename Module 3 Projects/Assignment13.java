// Derek Holbrook

package Module3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment13 {

    public static void main(String[] args) {
        
        // I chose HashMap, because I don't think I need any extra insertion order or sorting functionality for this assignment.
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Scanner userInput = new Scanner(System.in);
        String input = "";


        while (true) {
            System.out.println("Please enter a word (type 'stop' to exit): ");
            input = userInput.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            if (map.containsKey(input)) {
                map.put(input, map.get(input) + 1);
            }
            else {
                map.put(input, 1);
            }
        }

        System.out.println(map);

        int sum = 0;
        for (int count : map.values()) {
            sum = sum + count;
        }
        System.out.println("The sum of all values is: " + sum);

        //finding highest input
        int max = 0;
        for (int count : map.values()) {
            if (count > max) {
                max = count;
            }
        }

        System.out.println("The following are the words with the highest input:");
        for(Map.Entry<String,Integer> i: map.entrySet()) {
            if(i.getValue()==max) {
            System.out.println(i.getKey() + " " +  i.getValue());
            }
        }

        userInput.close();        
    }
}

// Use the map.values() function **
// map.keys() shows all keys
// map.entry()
