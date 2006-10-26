/*
 * Employee.java
 *
 * Created on August 18, 2006, 2:54 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package hello;

/**
 *
 * @author home
 */
public class Employee {
    
    /** Creates a new instance of Employee */
    public Employee(int i) {
        this.id = i;
    }
    
    private int id;
    private String name;
    private int age;
    private double salary;

    public int getID() {
        return id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
