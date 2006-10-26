/*
 * Main.java
 *
 * Created on August 18, 2006, 2:53 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package hello;

/**
 *
 * @author home
 */
public class Main {
    
    /** Creates a new instance of Main */
    public Main() {
    }
    //lkjd
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Employee e1 = new Employee(100);
        e1.setAge(22);
        e1.setName("apple");
        e1.setSalary(343.3);
        System.out.println("salary : " + e1.getID());
    }
    
}
