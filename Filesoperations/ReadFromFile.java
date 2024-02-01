package Filesoperations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ReadFromFile {
    public static void main(String[] args) {
       
       package Filesoperations;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileExits {
    public static void main(String[] args) {
        
         Path filePath = Paths.get("C:\\Users\\karthik\\Desktop\\newfile.txt");

        System.out.println("File exists: " + Files.exists(filePath);
    }
}

        try {
            // Read all lines from the file into a List
            List<String> lines = Files.readAllLines(filePath);

            // Print each line
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

