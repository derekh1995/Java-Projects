//Derek Holbrook

package Module3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Assignment12 {

    public static void main(String[] args) {
        
        // I chose an array list because I read that they are faster and more efficient than linked lists.

        ArrayList<String> myList = new ArrayList<String>();
        Scanner userInput = new Scanner(System.in);
        String input = "";

        while(true) {
            System.out.print("Please enter an item to add to the list (type 'stop' to exit): ");
          	input = userInput.nextLine();  
          	if(input.equalsIgnoreCase("stop")) {
              break;
            }
          	myList.add(input);
          	   
        }

        Set<String> set = new HashSet<String>();
        set.addAll(myList);

        System.out.println("Your list size is: " + myList.size());
        System.out.println("Your list is " + myList);

        System.out.println("Your set size is: " + set.size());
        System.out.println("Your set is: " + set);
      
        if (myList.size()!=set.size()) {
         
        for (String item : set) {
            if (myList.indexOf(item)!=myList.lastIndexOf(item)) {
                System.out.println(item + " was a duplicate word.");
                break;
            }
        }
    }
      
      userInput.close();
    }
}
