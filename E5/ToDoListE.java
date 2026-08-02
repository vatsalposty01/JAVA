import java.util.ArrayList;
import java.util.Scanner;

public class ToDoListE {

    public static void main(String[] args) {
        
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of tasks to add: ");
        int taskCount = scanner.nextInt();
        scanner.nextLine();

        
        for (int i = 0; i < taskCount; i++) {
            System.out.print("Enter task " + (i + 1) + ": ");
            String task = scanner.nextLine();
            tasks.add(task);
        }

        
        StringBuffer sb = new StringBuffer();
        sb.append("TO-DO LIST\n");

        if (tasks.isEmpty()) {
            sb.append("No tasks in the list.\n");
        } else {
            for (int i = 0; i < tasks.size(); i++) {
                sb.append(i + 1)
                  .append(". ")
                  .append(tasks.get(i))
                  .append("\n");
            }
        }

        
        System.out.println(sb.toString());

        scanner.close();
    }
}