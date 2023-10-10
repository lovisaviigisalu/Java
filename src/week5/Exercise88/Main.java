package week5.Exercise88;

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<Student>();

        while (true) {
            System.out.print("Enter student name (or empty to finish): ");
            String name = reader.nextLine().trim();

            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter student number: ");
            String studentNumber = reader.nextLine();


            Student student = new Student(name, studentNumber);
            students.add(student);
        }


        for (Student student : students) {
            System.out.println(student);
        }
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine().trim();

        System.out.println("Result:");
        for (Student student : students) {
            if (student.getName().contains(searchTerm)) {
                System.out.println(student);
            }
        }
    }
    }

