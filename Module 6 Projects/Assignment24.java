import java.util.Scanner;
import java.util.stream.Collectors;
//import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Assignment24 {
        
    public static void main(String[] args) {
        
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

        List<String> myStream = myList.stream()
            .map(String::toLowerCase)
            .filter( i -> i.length() > 3)
            .collect(Collectors.toList());


        Consumer<String> printEach = i -> System.out.println(i);
        myStream.stream().forEach(printEach);

        userInput.close();


    }

}    

