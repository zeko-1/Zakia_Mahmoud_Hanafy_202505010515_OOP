import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("===== ADD TASKS =====");

        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter Task " + i + ": ");

            String task = input.nextLine();

            tasks.add(task);
        }

        System.out.println("\n===== TASK LIST =====");

        for (int i = 0; i < tasks.size(); i++) {

            System.out.println((i + 1) + ". " + tasks.get(i));

        }

        Save.saveTasks(tasks);

        input.close();
    }
}