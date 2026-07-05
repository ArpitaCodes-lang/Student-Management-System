package com.arpita.sms;
import java.util.ArrayList;
public class StudentManager {
    private ArrayList<Student>students;
    public StudentManager(){
        students = new ArrayList<>();
    }
    public void addStudent(Student student){
        students.add(student);
        System.out.println("Student added successfylly!");
    }
    public void displayStudents(){
        if (students.isEmpty()){
            System.out.println("No students found.");
            return;
        }
        System.out.println("\n------Student List------");
        for(Student s : students){
            System.out.println("ID : "+ s.getId());
            System.out.println("Name : "+ s.getName());
            System.out.println("Branch : "+ s.getBranch());
            System.out.println("CGPA : " + s.getCgpa());
            System.out.println("-----------------------");
        }
    }
}
