// Derek Holbrook

package Module3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class Assignment14 {
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        String fileName = "";

        System.out.println("Please enter a file name:");
        fileName = userInput.nextLine();

        try {

            File f = new File(fileName);

            if (f.exists()) {
                FileReader fr = new FileReader(fileName);
                int status = fr.read();
                while (status != -1) {
                    System.out.print((char)status);
                    status = fr.read();
                }
                fr.close(); 
            }

            else {
                FileWriter fw = new FileWriter(fileName, true);
                fw.write("This file was created for assignment 14");
                fw.close();
            }
        }

        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            userInput.close();
        }
    }
}

// Notes: Make sure the fr.close() is OUTSIDE the while loop, otherwise you get IO Exceptions for stream closed
