import java.io.BufferedWriter; // Import BufferedWriter for efficient file writing
import java.io.FileWriter;    // Import FileWriter for creating/writing files
import java.io.IOException;   // Import IOException to handle file-related errors

// Main class
public class AppendToFile {
    // Entry point of the program
    public static void main(String[] args) {
        // Define the string to be written to the file, with a newline at the end
        String s1 = "Java files are easy" + "\n";

        // Try block to handle file operations
        try {
            // Create a BufferedWriter object, wrapping a FileWriter
            // FileWriter("newfile.txt", true) ensures the file is opened in append mode
            BufferedWriter writer = new BufferedWriter(new FileWriter("newfile.txt", true));

            // Write the string to the file
            writer.write(s1);

            // Close the BufferedWriter to save changes and release resources
            writer.close();
        } catch (IOException ioe) {
            // Catch block to handle IOException
            // Print an error message if file writing fails
            System.out.println("Couldn't write to file");
        }
    }
}
