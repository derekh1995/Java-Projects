package a28;

import org.apache.commons.io.FilenameUtils;
import org.apache.commons.io.IOUtils;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Assignment28 {
    public static void main(String[] args) {
    
        System.out.println("Please enter a file path: ");
        Scanner filePathScanner = new Scanner(System.in);
        String filePath = filePathScanner.nextLine();
        
        FilenameUtils.normalize(filePath);
        System.out.println(FilenameUtils.getBaseName(filePath));
        
        try (FileInputStream input = new FileInputStream(filePath)) {
        	
        	//Unsure why I'm getting a "deprecation" warning here for .readLines
        	@SuppressWarnings("deprecation")
			List<String> lines = IOUtils.readLines(input);
        	
        	
        	for (String line : lines) {
        		System.out.println(line);	
        	}
        	
        IOUtils.closeQuietly(input);
        }
        
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        catch (IOException e) {
            e.printStackTrace();
        }

        finally {
            filePathScanner.close();
        } 
    }
}
