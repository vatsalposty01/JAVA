import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {

    public static void main (String a[]){

        ArrayList<String> courses = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of tasks:");
        int n =sc.nextInt();
        sc.nextLine();

        for (int i=0; i < n;i++){
            
            System.out.println("Enter task:"+(i+1)+":");
            courses.add(sc.nextLine());

        }


        StringBuffer sb = new StringBuffer();
        sb.append("To-Do-List :\n");

        for (int i=0; i < courses.size();i++){
            
            sb.append(i + 1).append(". ").append(courses.get(i)).append("\n");

        }
        System.out.println(sb);
        sc.close();

    }

}

// import java.util.*;

// public class TodoList {

//     public static void main (String a[]){

//         // FIXED: Renamed the list to 'tasks' to match the rest of your code
//         ArrayList<String> tasks = new ArrayList<>();
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter number of tasks:");
//         int n = sc.nextInt();
//         sc.nextLine(); // Clears the newline character from the buffer

//         // FIXED: Loop runs up to 'n' (the user's input), not the empty list size
//         for (int i = 0; i < n; i++){
//             System.out.println("Enter task " + (i + 1) + ":");
//             tasks.add(sc.nextLine());
//         }

//         StringBuffer sb = new StringBuffer();
//         sb.append("To-Do-List :\n");

//         for (int i = 0; i < tasks.size(); i++){
//             // FIXED: Chained the .append() calls correctly and added the missing semicolon
//             sb.append(i + 1).append(". ").append(tasks.get(i)).append("\n");
//         }
        
//         System.out.println(sb);
//         sc.close();
//     }
// }

// import java.util.ArrayList;
// import java.util.Vector;
// import java.util.Scanner;

// public class TodoList {

//     public static void main(String[] args) {
//         // 1. Dynamic storage for primary active tasks
//         ArrayList<String> tasks = new ArrayList<>();
        
//         // 2. Dynamic thread-safe storage for completed or archived tasks
//         Vector<String> completedTasks = new Vector<>();
        
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter number of tasks to add: ");
//         int n = sc.nextInt();
//         sc.nextLine(); // Clear newline buffer

//         // Populate the ArrayList
//         for (int i = 0; i < n; i++) {
//             System.out.print("Enter task " + (i + 1) + ": ");
//             tasks.add(sc.nextLine());
//         }

//         // Simulate completing the first task (if any exists) by moving it to Vector
//         if (!tasks.isEmpty()) {
//             completedTasks.add(tasks.remove(0));
//         }

//         // 3. String manipulation using StringBuffer
//         StringBuffer sb = new StringBuffer();
        
//         sb.append("===== MY TO-DO LIST =====\n");
//         sb.append("Active Tasks:\n");
//         if (tasks.isEmpty()) {
//             sb.append("  (None)\n");
//         } else {
//             for (int i = 0; i < tasks.size(); i++) {
//                 sb.append("  ").append(i + 1).append(". ").append(tasks.get(i)).append("\n");
//             }
//         }

//         sb.append("\nCompleted Tasks (Vector Storage):\n");
//         if (completedTasks.isEmpty()) {
//             sb.append("  (None)\n");
//         } else {
//             for (int i = 0; i < completedTasks.size(); i++) {
//                 sb.append("  [✓] ").append(completedTasks.get(i)).append("\n");
//             }
//         }

//         System.out.println(sb.toString());
//         sc.close();
//     }
// }