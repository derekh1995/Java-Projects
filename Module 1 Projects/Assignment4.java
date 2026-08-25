import java.util.Scanner;

public class Assignment4 
{
    public static void main(String[] args) 
    {
        System.out.println("Please enter a whole number: ");
        Scanner numInput = new Scanner(System.in);
        String num = numInput.nextLine();
        int numInt = Integer.parseInt(num);

        if(numInt < 0) {
            System.out.println("Negative.");
        }
        else if(numInt > 0) {
            System.out.println("Positive.");
        }
        else if(numInt == 0) {
            System.out.println("Zero.");
        }
        
        numInput.close();

    }    
}
