import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class Assignment25 {
        
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
        String fileName = "";

        System.out.println("Please enter a file name:");
        fileName = userInput.nextLine();
        
        try (Stream<String> lines = Files.lines(Paths.get(fileName))) {

            lines.filter(line -> {
              	return (line.length() > 0);
            })
            .map(line -> {
            	return line.split(",");
            })
            .filter(items -> {
              	return (Integer.parseInt(items[1]) > 0);
            })
            .forEach(items -> {
              System.out.println(items[0] + " -> " + items[1]);

            });
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
