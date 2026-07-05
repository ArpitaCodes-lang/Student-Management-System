package com.arpita.sms;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        while (true) {
            System.out.println("\n=====Student Management System=====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3.Exit ");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();
                    System.out.println("Enter CGPA: ");
                    double cgpa = sc.nextDouble();
                    Student student = new Student(id ,name , branch, cgpa);
                    manager.addStudent(student);
                    break;
                case 2:
                    manager.displayStudents();
                    break;
                case 3:
                    System.out.println("Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}