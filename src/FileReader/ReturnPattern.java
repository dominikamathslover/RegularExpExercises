package FileReader;

import java.io.*;
import java.util.regex.*;

public class ReturnPattern {


    public static void main(String[] args) throws IOException {

        try {// Creating a file
            FileWriter writer = new FileWriter("test.txt");
            // Writing in file
            writer.write("Writing in the test file!");
            writer.close();
            // Success Message
            System.out.println(
                    "Successfully wrote to the file.\n");
        }

        // Catch block to handle exception
        catch (IOException e) {
            // Catching any error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // FileReader
        BufferedReader read = new BufferedReader(
                new FileReader("test.txt"));

        // The regex pattern
        Pattern pattern = Pattern.compile("[A-Za-z][a-z]+");
        System.out.println("Matched Content:");
        // For each line of input, try matching the pattern

        String line;
        while ((line = read.readLine()) != null) {


            Matcher match = pattern.matcher(line);
            while (match.find()) {

                // One method:
                // System.out.println(match.group(0));

                // Another method:
                // Get the starting position of the text
                int start = match.start(0);

                // Get ending position
                int end = match.end(0);

                // Print whatever matched.
                System.out.println(
                        line.substring(start, end));
            }
        }
    }
}





