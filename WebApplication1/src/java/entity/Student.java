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
    private double free;

 * @author Dell
 */
public class Student {

    private int id;
    private String name;
    private String email;
    private double fee;
0

    public Student() {
    }


    public Student(int id, String name, String email, double free) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.free = free;
    }

    public Student(String name, String email, double free) {
        this.name = name;
        this.email = email;
        this.free = free;

    public Student(int id, String name, String email, double fee) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.fee = fee;
    }

    public Student(String name, String email, double fee) {
        this.name = name;
        this.email = email;
        this.fee = fee;

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


    public double getFree() {
        return free;
    }

    public void setFree(double free) {
        this.free = free;
    }
    
    

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


}
