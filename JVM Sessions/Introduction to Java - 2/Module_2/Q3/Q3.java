package Module_2.Q3;
import java.io.*;
public class Q3 {
        public static void WordCountInFile(String[] args) {
            String filename = args[0];
            String targetWord = args[1].toLowerCase();
            try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                writer.write("This is a random file with some random content.\n");
                writer.write("Random words appear randomly like random, file, word, or something else.\n");
               } catch (IOException e) {
                System.out.println("Error writing to file: " + e.getMessage());
                return;
            }

            int count = 0;

            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String line;
                while ((line = reader.readLine()) != null) {

                    String[] words = line.toLowerCase().split("\\W+");

                    for (String word : words) {
                        if (word.equals(targetWord)) {
                            count++;
                        }
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading the file: " + e.getMessage());
            }

            System.out.println("The word '" + targetWord + "' occurred " + count + " time(s) in the file '" + filename + "'.");
        }
    }


