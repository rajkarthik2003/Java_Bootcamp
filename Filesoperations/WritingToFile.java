package Filesoperations;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class WritingToFile {
    public static void main(String[] args) {
        // Specify the path to the file
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

        // Data to be written to the newfile
        List<String> content = Arrays.asList("Line 1", "Line 2", "Line 3");

        try {
            // Writing  the content to the file
            Files.write(filePath, content);

            System.out.println("File written successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
