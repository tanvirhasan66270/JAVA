/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Student {

    private int id;
    private String name;
    private String subject;
    private double marks;
    private String departments;

    public Student() {
    }

    public Student(int id, String name, String subject, double marks, String departments) {
        this.id = id;
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.departments = departments;
    }

    public Student(String name, String subject, double marks, String departments) {
        this.name = name;
        this.subject = subject;
        this.marks = marks;
        this.departments = departments;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getDepartments() {
        return departments;
    }

    public void setDepartments(String departments) {
        this.departments = departments;
    }

  
}
