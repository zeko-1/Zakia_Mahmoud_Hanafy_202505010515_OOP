import java.io.*;
import java.util.ArrayList;

public class Save {

    public static void saveTasks(ArrayList<String> tasks) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("task.txt"))) {

            for (String task : tasks) {

                writer.write(task);
                writer.newLine();

            }

            System.out.println("\nTasks saved successfully.\n");

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

        System.out.println("===== TASKS LOADED FROM FILE =====");

        try (BufferedReader reader = new BufferedReader(new FileReader("task.txt"))) {

            String line;

            while ((line = reader.readLine()) != null) {

                System.out.println(line);

            }

        } catch (IOException e) {

            System.out.println(e.getMessage());

        }

    }
}