package com.arpita.sms;

public class Student {
    private int id;
    private String name;
    private String branch;
    private double cgpa;
    public Student(int id,String name,String branch, double cgpa){
        this.id = id;
        this.name = name;
        this.branch = branch;
        this.cgpa = cgpa;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getBranch(){
        return branch;
    }
    public double getCgpa(){
        return cgpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBranch(String branch) {
        this.branch = branch;
    }
    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }
}

