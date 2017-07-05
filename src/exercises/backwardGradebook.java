package exercises;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by robin on 6/30/17.
 */
public class backwardGradebook {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newId;

        System.out.println("Enter your students (or ENTER to finish):");

        // Get student names and grades
        do {

            System.out.print("Id: ");
            newId = in.nextInt();

            if (!newId.equals("")) {
                System.out.print("Name: ");
                String newName = in.nextLine();
                students.put(newId, newName);

                // Read in the newline before looping back
                in.nextLine();
            }

        } while(!newId.equals(""));

        // Print class roster
        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet())
            System.out.println(student.getKey() + " (" + student.getValue() + ")");
    }
}


