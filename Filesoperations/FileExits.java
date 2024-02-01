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
