package org.launchcode.java.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class GradeBookHashMap {
    public static void main(String[] args) {

        ArrayList<Integer> studentIds = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String newStudentName;

        System.out.println("Enter your students name:");

        // Get student names
        do {
            newStudentName = in.nextLine();

            if (!newStudentName.equals("")) {
                studentNames.add(newStudentName);
            }

        } while (!newStudentName.equals(""));

        // Get student Ids
        for (String studentName : studentNames) {
            System.out.print("Id for " + studentName + ": ");
            Integer studentId = in.nextInt();
            studentIds.add(studentId);
        }
        System.out.println("\nClass roster:");

        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println("Id:" + studentIds.get(i) + " = (" + studentNames.get(i) + ")");

        }
    }
}
