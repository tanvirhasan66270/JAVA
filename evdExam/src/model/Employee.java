/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Admin
 */
public class Employee {
    
    private int id;
   private String name;
   private double salary;
   private String desegnation;

    public Employee() {
    }

    public Employee(int id, String name, double salary, String desegnation) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.desegnation = desegnation;
    }

    public Employee(String name, double salary, String desegnation) {
        this.name = name;
        this.salary = salary;
        this.desegnation = desegnation;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDesegnation() {
        return desegnation;
    }

    public void setDesegnation(String desegnation) {
        this.desegnation = desegnation;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", salary=" + salary + ", desegnation=" + desegnation + '}';
    }

   
   
   
}
