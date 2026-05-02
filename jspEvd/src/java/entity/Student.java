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
    private String email;
    private double fee;
    private String fatherName;

    public Student() {
    }

    public Student(int id, String name, String email, double fee, String fatherName) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.fee = fee;
        this.fatherName = fatherName;
    }

    public Student(String name, String email, double fee, String fatherName) {
        this.name = name;
        this.email = email;
        this.fee = fee;
        this.fatherName = fatherName;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

   
}
