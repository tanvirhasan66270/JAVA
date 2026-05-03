/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author Admin
 */
public class Emp {
    
    private int id;
    private String name;
    private String salary;
    private String date;
    private String email;
    private String subject;

    public Emp() {
    }

    public Emp(int id, String name, String salary, String date, String email, String subject) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.email = email;
        this.subject = subject;
    }

    public Emp(String name, String salary, String date, String email, String subject) {
        this.name = name;
        this.salary = salary;
        this.date = date;
        this.email = email;
        this.subject = subject;
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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
   
  
}
